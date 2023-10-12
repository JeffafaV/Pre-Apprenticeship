class TemperatureTest {
    public static void main(String[] args) {
        System.out.println("Testing constructors");
        Temperature t1 = new Temperature();
        System.out.println(t1);
        Temperature t2 = new Temperature(80);
        System.out.println(t2);
        Temperature t3 = new Temperature('C');
        System.out.println(t3);
        Temperature t4 = new Temperature(26.6, 'C');
        System.out.println(t4);
        
        System.out.println("Testing set functions");
        t1.setTemperature(50);
        t1.setTempType('C');
        t2.setTempAndType(70, 'F');
        
        System.out.println("Testing get functions");
        System.out.println(t1.getCelsius());
        System.out.println(t2.getFahrenheit());
        
        System.out.println("Testing comparison functions");
        System.out.println(t1.equalTo(t2));
        System.out.println(t1.greaterThan(t2));
        System.out.println(t1.lessThan(t2));
        
        System.out.println("Testing temperature equalities");
        t1.setTempAndType(0, 'C');
        t2.setTempAndType(32, 'F');
        System.out.println(t1.equalTo(t2));
        t1.setTempAndType(-40, 'C');
        t2.setTempAndType(-40, 'F');
        System.out.println(t1.equalTo(t2));
        t1.setTempAndType(100, 'C');
        t2.setTempAndType(212, 'F');
        System.out.println(t1.equalTo(t2));
    }
}