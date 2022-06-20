package ss5_access_modifier_static.thuchanh.static_property;

public class TestStaticProperty {public static void main(String[] args) {
    Car Car1=new Car("Mazda 3","Skyactiv 3");
    System.out.println(Car.numberOfCars);
    Car Car2=new Car("Mazda 6","Skyactiv 6");
    System.out.println(Car.numberOfCars);
    }
}
