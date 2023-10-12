public class Odometer {
    private double distance;
    private double mpg;
    private double fuel;
    
    Odometer() {
        distance = 0;
        mpg = 0;
        fuel = 0;
    }
    
    public void setDistance(double d) {
        distance = d;
    }
    
    public void setMpg(double m) {
        mpg = m;
    }
    
    public void setFuel(double f) {
        fuel = f;
    }
    
    public double getDistance() {
        return distance;
    }
    
    public double getMpg() {
        return mpg;
    }
    
    public double getFuel() {
        return fuel;
    }
    
    public void addDistance(double d) {
        distance = distance + d;
    }
    
    public void addFuelUsed(double d) {
        fuel = fuel + d / mpg;
    }
    
    public void resetOdo() {
        distance = 0;
        fuel = 0;
    }
}