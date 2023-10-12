public class Figure {
    int centerPoint;
    
    Figure() {
        centerPoint = 0;
    }
    
    public String toString() {
        return ("Center point: " + centerPoint);
    }
    
    void erase() {
        System.out.println("Erase of Figure class");
    }
    
    void draw() {
        System.out.println("Draw of Figure class");
    }
    
    void center() {
        erase();
        draw();
    }
}