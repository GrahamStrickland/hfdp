import java.util.Date;

public class GardenLight extends Light {
    private Date duskTime = new Date();
    private Date dawnTime = new Date();

    public void setDuskTime(int time) {
        assert(time <= 6);
        duskTime.setTime((duskTime.getTime() % 43200000L) + 43200000L + time);
        System.out.println("Garden Light dusk time set to " + duskTime.toString());
    }

    public void setDawnTime(int time) {
        assert(time <= 6);
        dawnTime.setTime((dawnTime.getTime() % 43200000L) + time);
        System.out.println("Garden Light dawn time set to " + dawnTime.toString());
    }

    public void manualOn() {
        System.out.println("Garden Light is On");
    }

    public void manualOff() {
        System.out.println("Garden Light is Off");
    }
}
