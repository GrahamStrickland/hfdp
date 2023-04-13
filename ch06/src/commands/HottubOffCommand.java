package commands;
import appliances.Hottub;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.setTemperature(98);
        hottub.jetsOff();
    }
    
    public void undo() {
        hottub.setTemperature(104);
        hottub.jetsOn();
    }
}
