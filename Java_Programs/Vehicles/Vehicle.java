public class Vehicle {
    private String manufact;
    private int cylndrs;
    private Person owner;
    
    public Vehicle() {
        manufact = "Unavailable";
        cylndrs = 0;
        owner = new Person();
    }
    
    public Vehicle(Vehicle b) {
        manufact = b.manufact;
        cylndrs = b.cylndrs;
        owner = b.owner;
    }
    
    public Vehicle (String m, int c, Person b) {
        manufact = m;
        cylndrs = c;
        owner = b;
    }
    
    public void setManufact(String m) {
        manufact = m;
    }
    
    public void setCylndrs(int c) {
        cylndrs = c;
    }
    
    public void setOwner(Person b) {
        owner = b;
    }
    
    public String getManufact() {
        return manufact;
    }
    
    public int getCylndrs() {
        return cylndrs;
    }
    
    public Person getOwner() {
        return owner;
    }
    
    public String toString() {
        return ("Manufacturer: " + manufact +
        "\nNumber of cylinders: " + cylndrs +
        "\nOwner: " + owner.getName());
    }
    
    public boolean equals(Vehicle b) {
        return (manufact.equals(b.manufact) &&
        cylndrs == b.cylndrs && owner.equals(b.owner));
    }
}