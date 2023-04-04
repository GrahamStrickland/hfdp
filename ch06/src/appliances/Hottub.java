package appliances;
public class Hottub {
    private String location;
    private int temperature;

    public Hottub(String location) {
        this.location = location;
        temperature = 95;
    }
    
    public void circulate() {
        System.out.println(location + " Hottub is Circulating");
    }

    public void jetsOn() {
        System.out.println(location + " Hottub Jets are On");
    }

    public void jetsOff() {
        System.out.println(location + " Hottub Jets are Off");
    }

    public void setTemperature(int temperature) {
        System.out.println(location + " Hottub temperature is " + this.temperature + "F");
    }
}
