public class Triangle extends Figure {
    int side1;
    int side2;
    int side3;
    
    Triangle() {
        super();
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }
    
    public String toString() {
        return (super.toString() + " Side1: " + side1 +
        " Side2: " + side2 + " Side3: " + side3);
    }
    
    void erase() {
        System.out.println("Erase of Triangle class");
    }
    
    void draw() {
        System.out.println("Draw of Triangle class");
    }
}