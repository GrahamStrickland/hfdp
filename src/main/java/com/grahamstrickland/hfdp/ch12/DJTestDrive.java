package com.grahamstrickland.hfdp.ch12;

import com.grahamstrickland.hfdp.ch12.controllers.interfaces.ControllerInterface;
import com.grahamstrickland.hfdp.ch12.controllers.BeatController;
import com.grahamstrickland.hfdp.ch12.models.interfaces.BeatModelInterface;
import com.grahamstrickland.hfdp.ch12.models.BeatModel;

public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
    
}
