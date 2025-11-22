package creational.factory;

class LogisticsFactory {
    public static Logistics getLogistics(String mode){
        if(mode.equals("Road"))
            return new Road();
        else if(mode.equals("Air"))
            return new Air();
        return new Train();
    }
}
