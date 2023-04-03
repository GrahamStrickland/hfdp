public class CeilingFan {
    private int HIGH_SPEED = 6;
    private int MED_SPEED = 4;
    private int LOW_SPEED = 2;
    private int speed = 0;

    public void high() {
        speed = HIGH_SPEED;
        System.out.println("Ceiling Fan speed set to " + getSpeed());
    }

    public void medium() {
        speed = MED_SPEED;
        System.out.println("Ceiling Fan speed set to " + getSpeed());
    }

    public void low() {
        speed = LOW_SPEED;
        System.out.println("Ceiling Fan speed set to " + getSpeed());
    }

    public void off() {
        speed = 0;
        System.out.println("Ceiling Fan is off");
    }
    
    public int getSpeed() {
        return speed;
    }
}
