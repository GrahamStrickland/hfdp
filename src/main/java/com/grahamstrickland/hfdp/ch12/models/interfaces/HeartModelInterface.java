package com.grahamstrickland.hfdp.ch12.models.interfaces;

import com.grahamstrickland.hfdp.ch12.observers.interfaces.BeatObserver;
import com.grahamstrickland.hfdp.ch12.observers.interfaces.BPMObserver;

public interface HeartModelInterface {
    int getHeartRate();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
