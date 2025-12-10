package com.grahamstrickland.hfdp.ch12;

import com.grahamstrickland.hfdp.ch12.controllers.interfaces.ControllerInterface;
import com.grahamstrickland.hfdp.ch12.controllers.HeartController;
import com.grahamstrickland.hfdp.ch12.models.HeartModel;

public class HeartTestDrive {

    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
    
}
