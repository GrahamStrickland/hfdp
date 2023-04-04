package appliances;
public class TV {
    private String location;
    private int inputChannel;
    private int volume;

    public TV(String location) {
        this.location = location;
        inputChannel = 1;
        volume = 0;
    }

    public void on() {
        System.out.println(location + " TV is On");
    }

    public void off() {
        System.out.println(location + " TV is Off");
    }

    public void setInputChannel(int inputChannel) {
        this.inputChannel = inputChannel;
        System.out.println(location + " TV Channel set to " + this.inputChannel);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + " TV Volume set to " + this.volume);
    }
}
