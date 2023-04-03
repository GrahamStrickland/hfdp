public class Stereo {
    private int volume;

    public void on() {
        System.out.println("Stereo is On");
    }
    
    public void off() {
        System.out.println("Stereo is Off");
    }

    public void setCd() {
        System.out.println("Stereo set to CD");
    }

    public void setDvd() {
        System.out.println("Stereo set to DVD");
    }

    public void setRadio() {
        System.out.println("Stereo set to Radio");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Stereo volume set to " + this.volume);
    }
}
