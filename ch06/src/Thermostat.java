public class Thermostat {
    private int temperature = 95;
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat set to " + this.temperature + "F");
    }
}
