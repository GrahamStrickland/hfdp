public class Hottub {
    private int temperature = 95;
    
    public void circulate() {
        System.out.println("The Hottub is Circulating");
    }

    public void jetsOn() {
        System.out.println("The Hottub Jets are On");
    }

    public void jetsOff() {
        System.out.println("The Hottub Jets are Off");
    }

    public void setTemperature(int temperature) {
        System.out.println("The Hottub temperature is " + this.temperature + "F");
    }
}
