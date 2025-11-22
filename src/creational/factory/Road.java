package creational.factory;

class Road implements Logistics{
    @Override
    public void send() {
        System.out.println("Sending by road logic.");
    }
}
