package appliances;
public class CeilingFan {
    private final int HIGH_SPEED = 6;
    private final int MED_SPEED = 4;
    private final int LOW_SPEED = 2;

    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = 0;
    }

    public void high() {
        speed = HIGH_SPEED;
        System.out.println(location + " Ceiling Fan speed set to " + getSpeed());
    }

    public void medium() {
        speed = MED_SPEED;
        System.out.println(location + " Ceiling Fan speed set to " + getSpeed());
    }

    public void low() {
        speed = LOW_SPEED;
        System.out.println(location + " Ceiling Fan speed set to " + getSpeed());
    }

    public void on() {
        System.out.println(location + " Ceiling Fan is On");
    }

    public void off() {
        speed = 0;
        System.out.println(location + " Ceiling Fan is Off");
    }
    
    public int getSpeed() {
        return speed;
    }
}
