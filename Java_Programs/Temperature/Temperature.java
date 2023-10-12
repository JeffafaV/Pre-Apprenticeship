public class Temperature {
    private double temperature;
    private char tempType;
    
    Temperature() {
        temperature = 0;
        tempType = 'F';
    }
    
    Temperature(double t) {
        temperature = t;
        tempType = 'F';
    }
    
    Temperature(char tt) {
        temperature = 0;
        tempType = tt;
    }
    
    Temperature(double t, char tt) {
        temperature = t;
        tempType = tt;
    }
    
    double getCelsius() {
        if (tempType == 'C') {
            return temperature;
        }
        
        return Math.round(((temperature - 32d) / 1.8d) * 10d) / 10d;
    }
    
    double getFahrenheit() {
        if (tempType == 'F') {
            return temperature;
        }
        
        return Math.round((9d * temperature / 5d + 32d) * 10d) / 10d;
    }
    
    void setTemperature(double t) {
        temperature = t;
    }
    
    void setTempType(char tt) {
        if (tt == 'C' || tt == 'F') {
            tempType = tt;
            return;
        }
        
        System.out.println("Wrong Input. Temperature type must be C or F.");
    }
    
    void setTempAndType(double t, char tt) {
        temperature = t;
        
        if (tt == 'C' || tt == 'F') {
            tempType = tt;
            return;
        }
        
        System.out.println("Wrong Input. Temperature type must be C or F.");
    }
    
    boolean equalTo(Temperature second) {
        if (this.getFahrenheit() == second.getFahrenheit())
        {
            return true;
        }
        
        return false;
    }
    
    boolean greaterThan(Temperature second) {
        if (this.getFahrenheit() > second.getFahrenheit())
        {
            return true;
        }
        
        return false;
    }
    
    boolean lessThan(Temperature second) {
        if (this.getFahrenheit() < second.getFahrenheit())
        {
            return true;
        }
        
        return false;
    }
    
    public String toString() {
        return ("Temperature is " + temperature + tempType);
    }
}