import controllers.interfaces.ControllerInterface;
import controllers.HeartController;
import models.HeartModel;

public class HeartTestDrive {

    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
    
}
