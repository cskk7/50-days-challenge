package OOPS.Day4_Interface;

interface Honda{
    void hondaCity();
    void hondaAmaze();

    default void hondaCars(){
        System.out.println("Good engine cars");
    }
}
interface Yamaha{
    void yamahaFZ();
    void yamahaR15();
}
interface Hero{
    void heroPassionPro();
    void  heroXPulse();
}
interface Ford {
    void fordFigo();
    void fordEndeaver();
    void fordEcosport();
}
class CarInfo implements Honda,Ford{

    @Override
    public void hondaCity(){
        System.out.println("1.5L i-VTEC Honda City");
    }


    @Override
    public void hondaAmaze() {
        System.out.println("1.2L i-VTEC Honda Amaze");
    }

    @Override
    public void fordFigo() {
        System.out.println("1.5L NA Ford Figo");
    }

    @Override
    public void fordEndeaver() {
        System.out.println("3.0L diesel Ford Endeavour");
    }

    @Override
    public void fordEcosport() {
        System.out.println("1.2L i-VTEC Ford Ecosport");
    }
}
class BikeInfo implements Yamaha,Hero{

    @Override
    public void yamahaFZ() {
        System.out.println("150 cc Yamaha FZ");
    }

    @Override
    public void yamahaR15() {
        System.out.println("150 cc V3 Yamaha R15");
    }

    @Override
    public void heroPassionPro() {
        System.out.println("110 cc Hero Passion Pro");
    }

    @Override
    public void heroXPulse() {
        System.out.println("200cc Hero XPulse");
    }
}
public class InterfaceProgVehicles{
    public static void main(String args[]){
        CarInfo cars = new CarInfo();
        cars.fordEcosport();
        cars.hondaCity();
        cars.fordFigo();
        cars.hondaCars();


        BikeInfo bikes = new BikeInfo();
        bikes.heroPassionPro();
        bikes.heroXPulse();

    }
}

