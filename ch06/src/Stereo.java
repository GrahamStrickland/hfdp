public class Stereo {
    private String Cd;
    private String Dvd;
    private String station;
    private int volume;

    public void on() {

    }
    
    public void off() {

    }

    public void setCd(String cdTitle) {
        Cd = cdTitle;
    }

    public void setDvd(String dvdTitle) {
        Dvd = dvdTitle;
    }

    public void setRadio(String station) {
        this.station = station;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
