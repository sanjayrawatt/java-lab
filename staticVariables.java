class Mobile {
    String brand;
    int price;
    static String name;

    // this is an instance method
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    // this is an static method
    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
 }
    
public class staticVariables {
    public static void main(String a[]) {
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1500;
        

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1300;
        

        Mobile.name = "Smartphone";

        obj.show();
        obj1.show();

        Mobile.show1(obj);
    }
}
    
