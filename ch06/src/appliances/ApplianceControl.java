package appliances;
public class ApplianceControl {
    private String location;

    public ApplianceControl(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Appliance Control is On");
    }
    
    public void off() {
        System.out.println(location + " Appliance Control is Off");
    }
}
