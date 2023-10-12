public class Person {
    private String name;
    
    public Person() {
        name = "Unavailable";
    }
    
    public Person(String n) {
        name = n;
    }
    
    public Person(Person b) {
        name = b.name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public String toString() {
        return ("Name: " + name);
    }
    
    public boolean equals(Person b) {
        return name.equals(b.name);
    }
}