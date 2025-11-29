package creational.prototype;

public class WelcomeEmail implements EmailTemplate{
    private final String subject;
    private String content;

    public WelcomeEmail(){
        this.subject = "Welcome to TUF";
        this.content = "Hi there! Thanks for joining us";
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void send(String to) {
        System.out.println("Sending to " + to + " : [" + subject + "] " + content);
    }

    @Override
    public EmailTemplate clone(){
        try {
            return (EmailTemplate) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
}
