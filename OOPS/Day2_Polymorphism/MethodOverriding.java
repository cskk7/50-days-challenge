package OOPS.Day2_Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        ChristmasOffer offer = new ChristmasOffer();
        offer.laptop("Dell");
        offer.mobile("iPhone");
        offer.watch("FastTrack");
    }
}
class AmazonPrices{ // Parent class


    void watch(String product){
        System.out.println(product+" : Discount = 10%");
    }
    void laptop(String product){
        System.out.println(product+" : Discount = 16%");
    }
    void mobile(String product){
        System.out.println(product+" : Discount = 13%");
    }
}
class ChristmasOffer extends AmazonPrices{ // Child class
    void watch(String product){
        System.out.println(product+" : Discount = 25%");
    }
    void laptop(String product){
        System.out.println(product+" : Discount = 34%");
    }
    void mobile(String product){
        System.out.println(product+" : Discount = 30%");
    }

}