public class TV {
    private int inputChannel = 1;
    private int volume = 0;

    public void on() {
        System.out.println("TV is On");
    }

    public void off() {
        System.out.println("TV is Off");
    }

    public void setInputChannel(int inputChannel) {
        this.inputChannel = inputChannel;
        System.out.println("TV Channel set to " + this.inputChannel);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV Volume set to " + this.volume);
    }
}
