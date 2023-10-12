public class FigureTest {
    public static void main(String[] args) {
        Figure f = new Figure();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        
        f.center();
        r.center();
        t.center();
        
        System.out.println(f);
        System.out.println(r);
        System.out.println(t);
    }
}