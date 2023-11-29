package OOPS.Day1_Inheritance;

class Bikes{
    void accelerate(){
        System.out.println("Accelerate using throttle in handlebars");
    }
    void brake(){
        System.out.println("Apply brake using brake pedal near left footrest ");
    }
    void manoeuvre(){
        System.out.println("Use handle bar to manoeuvre");
    }

}

class Cars{
    void accelerate(){
        System.out.println("Accelerate using gas pedal in leg-room");
    }
    void brake(){
        System.out.println("Apply brake using brake pedal in leg-room");
    }
    void manoeuvre(){
        System.out.println("Use steering wheel to manoeuvre");
    }
}

class Vehicles extends Cars,Bikes{ // Error occurs in this line, because java does not suppot multiple inheritence


}

public class MultipleInheritence {
    public static void main(String[] args) {
        Vehicle travel = new Vehicle();
        travel.accelerate();
        travel.brake();
    }
}
