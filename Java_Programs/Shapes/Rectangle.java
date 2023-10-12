public class Rectangle extends Figure {
    int length, breadth;
    
    Rectangle() {
        super();
        length = 0;
        breadth = 0;
    }
    
    public String toString() {
        return (super.toString() + " Length: " + length +
        " Breadth: " + breadth);
    }
    
    void erase() {
        System.out.println("Erase of Rectangle class");
    }
    
    void draw() {
        System.out.println("Draw of Rectangle class");
    }
}