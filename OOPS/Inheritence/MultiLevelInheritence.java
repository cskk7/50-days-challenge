public class MultiLevelInheritence{
    public static void main(String[] args) {
            Area myPlace = new Area();
            System.out.println(myPlace.area);
            System.out.println(myPlace.state);
            System.out.println(myPlace.city);
            System.out.println(myPlace.country);
            System.out.println(myPlace.continent);
            System.out.println(myPlace.location);
    }
}

class Continent{
    String location = "12°59'24.8\"N 80°14'58.6\"E";
    String continent = "Asia";
}
class Country extends Continent{
    String country = "India";
}
class State extends Country{
    String state = "TamilNadu";
}
class City extends State{
    String city = "Chennai";
}
class Area extends City{
    String area = "Taramani";
}
