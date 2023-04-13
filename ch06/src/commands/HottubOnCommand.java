package commands;
import appliances.Hottub;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.setTemperature(104);
        hottub.jetsOn();
    }
    
    public void undo() {
        hottub.setTemperature(98);
        hottub.jetsOff();
    }
}
