package Otp.Sender;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class emailSender {
    // Declare the instance variables
    private int flag = 0;
    private String name;
    private String email;
    private String mobile;
    private Scanner scan = new Scanner(System.in); 
    
    // Method to send email and verify OTP
    public int sendEmail() {
        // Asking the user for name
        System.out.println("Enter your name: ");
        name = scan.next();
        
        // Asking the user for mobile number
        System.out.println("Enter your 10-digit mobile number: ");
        mobile = scan.next();
        
        // Check if the mobile number is 10 digits
        if (mobile.length() != 10) {
            System.out.println("Please enter a valid 10-digit mobile number");
            return flag;
        }
        
        // Asking the user for their email address
        System.out.println("Enter your email address correctly : ");
        email = scan.next();
        
        // Generate a 6-digit OTP
        Random ran = new Random();
        int otp = 100000 + ran.nextInt(900000);  // Generate a random 6-digit number
        
        // Sender's Gmail credentials
        final String username = "molakathallavinaykumarreddy@gmail.com";  // sender Gmail
        final String password = "gliednuifcmtxajs";  // sender Gmail password or app password

        String toEmail = email;  // Recipient's email address

        // SMTP server information
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");  // TLS port

        // Create a Session with the SMTP server with authentication
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a new email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Hi, " + name);
            message.setText("Hello, your OTP is: " + otp);

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully!\n\n");
            
            // Prompt the user to enter the OTP
            System.out.println("Please enter your OTP here: ");
            int otpEntered = scan.nextInt();
            
            // Verify the OTP
            if (otpEntered == otp) {
                System.out.println("USER VERIFIED");
                flag = 1;
            } else {
                System.out.println("Incorrect OTP. Please try again.");
            }

        } catch (MessagingException e) {
            System.out.println("An error occurred while sending the email.");
            e.printStackTrace();  // Print full stack trace for debugging
        }
        return flag;
    }
}
