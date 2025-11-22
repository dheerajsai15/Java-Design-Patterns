package creational.factory;

class Train implements Logistics{

    @Override
    public void send() {
        System.out.println("Sending by train logic.");
    }
}
