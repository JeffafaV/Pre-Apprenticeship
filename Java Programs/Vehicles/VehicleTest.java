public class VehicleTest {
    public static void main(String[] args) {
        Person p1 = new Person("Jeff");
        System.out.println(p1);
        Person p2 = new Person("Jeff");
        
        if (p1.equals(p2)) {
            System.out.println("Same person");
        }
        else {
            System.out.println("Not same person");
        }
        
        p2.setName("Bob");
        
        if (p1.equals(p2)) {
            System.out.println("Same person");
        }
        else {
            System.out.println("Not same person");
        }
        
        Vehicle v1 = new Vehicle("Toyota", 6, p1);
        System.out.println(v1);
        Vehicle v2 = new Vehicle("Toyota", 6, p1);
        
        if (v1.equals(v2)) {
            System.out.println("Same vehicle");
        }
        else {
            System.out.println("Not same vehicle");
        }
        
        v2.setManufact("Lexus");
        v2.setCylndrs(4);
        v2.setOwner(p2);
        
        if (v1.equals(v2)) {
            System.out.println("Same vehicle");
        }
        else {
            System.out.println("Not same vehicle");
        }
        
        Truck t1 = new Truck("Ford", 8, p1, 0.8, 6800);
        System.out.println(t1);
        double load = 0.7;
        int tow = 7000;
        Truck t2 = new Truck(v2, load, tow);
        
        Truck t3 = new Truck();
        t3.setManufact("Ford");
        t3.setCylndrs(8);
        t3.setOwner(p1);
        t3.setMaxLoad(0.8);
        t3.setMaxTow(6800);
        
        if (t1.equals(t2)) {
            System.out.println("Same truck");
        }
        else {
            System.out.println("Not same truck");
        }
        
        if (t1.equals(t3)) {
            System.out.println("Same truck");
        }
        else {
            System.out.println("Not same truck");
        }
        
        Truck t4 = new Truck(t2);
        
        if (t2.equals(t4)) {
            System.out.println("Same truck");
        }
        else {
            System.out.println("Not same truck");
        }
    }
}