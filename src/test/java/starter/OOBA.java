package starter;

import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.search.FlagTerm;
import java.io.*;
import java.util.*;
import java.util.regex.*;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class OOBA {
    public static String enterVerCode(String username, String password) throws Exception {
        String code = getVerCode(username, password);
        String c = "";
        while (code == null){
            c = getVerCode(username, password);
        }
        return c;
    }

    public static String getVerCode(String username, String password) throws Exception {
        Properties props = System.getProperties();
        props.setProperty("mail.store.protocol", "imap");
        props.setProperty("mail.imaps.partialfetch", "false");
        props.put("mail.imap.ssl.enable", "true");
        props.put("mail.mime.base64.ignoreerrors", "true");
        Session session = Session.getDefaultInstance(props, null);
        Store store = session.getStore("imap");
        store.connect("imap.gmail.com", 993, username, password);
        Folder folder = store.getFolder("INBOX");
        folder.open(Folder.READ_WRITE);
        Thread.sleep(20000);
        Message [] messages = folder.getMessages();
        String code = "";
        for (int i=1; i<messages.length; i++) {
            Message mail = messages[messages.length-1];
            String result = "";
            if (mail.isMimeType("text/plain")) {
                result = mail.getContent().toString();
            } else if (mail.isMimeType("multipart/*")) {
                MimeMultipart mimeMultipart = (MimeMultipart) mail.getContent();
                result = getTextFromMimeMultipart(mimeMultipart);
            }
            Pattern p = Pattern.compile("code is:\\W+(\\w+)");
            Matcher m = p.matcher(result);
            if(result.contains("code is:")){
                while (m.find()){
                    code = m.group(1);
                }
                if (code!=null){
                    return code;
                }
            }
            mail.setFlag(Flags.Flag.DELETED,false);
        }
        folder.close();
        System.out.println("Code is: " + code);
        return code;
    }

    private static String getTextFromMimeMultipart(MimeMultipart mimeMultipart)  throws Exception {
        String result = "";
        int count = mimeMultipart.getCount();
        for (int i = 0; i < count; i++) {
            BodyPart bodyPart = mimeMultipart.getBodyPart(i);
            if (bodyPart.isMimeType("text/plain")) {
                result = result + "\n" + bodyPart.getContent();
                break;
            } else if (bodyPart.isMimeType("text/html")) {
                String html = (String) bodyPart.getContent();
                result = result + "\n" + org.jsoup.Jsoup.parse(html).text();
            } else if (bodyPart.getContent() instanceof MimeMultipart){
                result = result + getTextFromMimeMultipart((MimeMultipart)bodyPart.getContent());
            }
        }
        return result;
    }

    public static String getEmailBody(Message email) throws Exception {

        String line, emailContentEncoded;
        StringBuffer bufferEmailContentEncoded = new StringBuffer();
        BufferedReader reader = new BufferedReader(new InputStreamReader(email.getInputStream()));
        while ((line = reader.readLine()) != null) {
            bufferEmailContentEncoded.append(line);
        }

        System.out.println("**************************************************");

        System.out.println(bufferEmailContentEncoded);

        System.out.println("**************************************************");

        emailContentEncoded = bufferEmailContentEncoded.toString();

        if (email.getContentType().toLowerCase().contains("multipart/related")) {

            emailContentEncoded = emailContentEncoded.substring(emailContentEncoded.indexOf("base64") + 6);
            emailContentEncoded = emailContentEncoded.substring(0, emailContentEncoded.indexOf("Content-Type") - 1);

            System.out.println(emailContentEncoded);

//            String emailContentDecoded = new String(new Base64().decode(emailContentEncoded.toString().getBytes()));
//            return emailContentDecoded;
        }

        return emailContentEncoded;

    }

    public static void SendMailSSLWithAttachment(String username, String password) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }

                });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(username));
            message.setSubject("Testing Subject");
            // Create object to add multimedia type content
            BodyPart messageBodyPart1 = new MimeBodyPart();
            // Set the body of email
            messageBodyPart1.setText("This is message body");
            // Create another object to add another content
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();
            // Mention the file which you want to send
            File xx = new File(System.getProperty("user.home"), "/target/surefire-reports/");
            String filename = "emailable-report.html";
            // Create data source and pass the filename
            DataSource source = new FileDataSource(xx + "/" + filename);
            // set the handler
            if (((FileDataSource) source).getFile().exists()) {
                messageBodyPart2.setDataHandler(new DataHandler(source));
                // set the file
                messageBodyPart2.setFileName(filename);
                // Create object of MimeMultipart class
                Multipart multipart = new MimeMultipart();
                // add body part 1
                multipart.addBodyPart(messageBodyPart2);
                // add body part 2
                multipart.addBodyPart(messageBodyPart1);
                // set the content
                message.setContent(multipart);
                // finally send the email
                Transport.send(message);
                System.out.println("\n" + "===Email Sent===" +  "===To: "  + username + " ===!" + "===With File: "
                        + filename  + "\n");
            } else {
                System.out.println("\n" + "File doesn't exists "  + "\n");
            }
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void check(String host, String storeType, String user, String password) {
        try {

            // create properties
            Properties properties = new Properties();

            properties.put("mail.imap.host", host);
            properties.put("mail.imap.port", "993");
            properties.put("mail.imap.starttls.enable", "true");
            properties.put("mail.imap.ssl.trust", host);

            Session emailSession = Session.getDefaultInstance(properties);

            // create the imap store object and connect to the imap server
            Store store = emailSession.getStore("imaps");

            store.connect(host, user, password);

            // create the inbox object and open it
            Folder inbox = store.getFolder("Inbox");
            inbox.open(Folder.READ_ONLY);

            // retrieve the messages from the folder in an array and print it
            Message[] messages = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));
            System.out.println("messages.length---" + messages.length);

            for (int i = 0, n = messages.length; i < n; i++) {
                Message message = messages[i];
                message.setFlag(Flags.Flag.SEEN, true);
                System.out.println("---------------------------------");
                System.out.println("Email Number " + (i + 1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Text: " + message.getContent().toString());

            }

            inbox.close(false);
            store.close();

        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        String host = "imap.gmail.com";
        String mailStoreType = "imap";
        String username = "";
        String password = "";
        check(host, mailStoreType, username, password);
        getVerCode(username,password);
    }

    public static void releaseResources() {
        System.out.println("Releasing resources now.....");
        if (null != getDriver()) {
            getDriver().close();
            getDriver().quit();
        }
    }
}
