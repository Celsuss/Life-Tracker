package com.example.jensl.lifetracker;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

public class LifeTrackerAdapter extends ArrayAdapter<LifeTracker> {

    public LifeTrackerAdapter(Context context, int resource, List<LifeTracker> objects){
        super(context, resource, objects);
    }
}
