package OOPS.Inheritence;

public class HierarchialInheritence{
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.throttle();

        Car obj2 = new Car();
        obj2.reverse();

        Bus obj3 = new Bus();
        obj3.passenger();

        Truck obj4 = new Truck();
        obj4.load();
    }
}
class Vehicle{
    String vehicle = "Vehicle";
    void accelerate(){
        System.out.println(vehicle+" moves forward");
    }

    void brake(){
        System.out.println(vehicle+" stops");
    }
}
class Car extends Vehicle{
    void reverse(){
        vehicle = "Car";
        System.out.println(vehicle+" goes reverse");
    }
}
class Bike extends Vehicle{

    void throttle(){
        vehicle = "Bike";
        System.out.println(vehicle+" stops");
    }
}
class Bus extends Vehicle{
    void passenger(){
        vehicle = "Bus";
        System.out.println(vehicle+" Bus runs from Stop A to Stop B");
    }
}
class Truck extends Vehicle{
    void load(){
        vehicle = "Truck";
        System.out.println(vehicle+" Truck carry load");
    }
}

