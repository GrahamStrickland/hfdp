package com.grahamstrickland.hfdp.ch12.controllers;

import com.grahamstrickland.hfdp.ch12.adapters.HeartAdapter;
import com.grahamstrickland.hfdp.ch12.controllers.interfaces.ControllerInterface;
import com.grahamstrickland.hfdp.ch12.models.interfaces.HeartModelInterface;
import com.grahamstrickland.hfdp.ch12.views.DJView;

public class HeartController implements ControllerInterface {
    HeartModelInterface model;
    DJView view;

    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    public void start() {}

    public void stop() {}

    public void increaseBPM() {}

    public void decreaseBPM() {}

    public void setBPM(int bpm) {}
}
