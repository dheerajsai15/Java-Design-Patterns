package creational.prototype;

public interface EmailTemplate extends Cloneable{
    void setContent(String content);
    void send(String to);
    EmailTemplate clone(); //Deep copy is recommended
}
