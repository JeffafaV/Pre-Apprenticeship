public class Truck extends Vehicle {
    private double maxLoad;
    private int maxTow;
    
    public Truck() {
        super();
        maxLoad = 0;
        maxTow = 0;
    }
    
    public Truck(String m, int c, Person b, double l, int t) {
        super(m, c, b);
        maxLoad = l;
        maxTow = t;
    }
    
    public Truck(Vehicle b, double l, int t) {
        super(b);
        maxLoad = l;
        maxTow = t;
    }
    
    public Truck(Truck b) {
        super(b);
        maxLoad = b.maxLoad;
        maxTow = b.maxTow;
    }
    
    public double getMaxLoad() {
        return maxLoad;
    }
    
    public int getMaxTow() {
        return maxTow;
    }
    
    public void setMaxLoad(double l) {
        maxLoad = l;
    }
    
    public void setMaxTow(int t) {
        maxTow = t;
    }
    
    public String toString() {
        return ("Manufacturer: " + getManufact() +
        "\nNumber of cylinders: " + getCylndrs() +
        "\nMax load: " + maxLoad + "\nMax tow: " +
        maxTow + "\nOwner: " + getOwner().getName());
    }
    
    public boolean equals(Truck b) {
        return (super.equals(b) && maxLoad == b.maxLoad &&
        maxTow == b.maxTow);
    }
}