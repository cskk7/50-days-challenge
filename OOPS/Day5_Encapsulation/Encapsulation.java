package OOPS.Day5_Encapsulation;

public class Encapsulation{
    public static void main(String[] args) {
        Details details = new Details();
        details.setName("Ravi");
        details.setAge(23);
        details.setCity("Chennai");
        System.out.println(details.getName());
        System.out.println(details.getAge());
        System.out.println(details.getCity());
    }
}

class Details{
    private String name;
    private String city;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    
}