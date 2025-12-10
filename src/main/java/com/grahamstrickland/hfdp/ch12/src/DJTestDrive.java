import controllers.interfaces.ControllerInterface;
import controllers.BeatController;
import models.interfaces.BeatModelInterface;
import models.BeatModel;

public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
    
}
