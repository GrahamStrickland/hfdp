package appliances;
public class Sprinkler {
    private String location;

    public Sprinkler(String location) {
        this.location = location;
    }

    public void waterOn() {
        System.out.println(location + " Sprinkler is On");
    }

    public void waterOff() {
        System.out.println(location + " Sprinkler is Off");
     }
}
