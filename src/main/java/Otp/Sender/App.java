package Otp.Sender;

public class App {
    public static void main(String[] args) {
        emailSender sendEmail = new emailSender();
        int result = sendEmail.sendEmail();
        if(result == 1) {
            System.out.println("You are successfully verified");
        } else {
            System.out.println("Verification failed");
        }
    }
}
