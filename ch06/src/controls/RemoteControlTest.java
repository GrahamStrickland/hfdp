package controls;
import appliances.GarageDoor;
import appliances.Light;
import commands.GarageDoorUpCommand;
import commands.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor("House");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorUpCommand garageOpen =
            new GarageDoorUpCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }   
}
