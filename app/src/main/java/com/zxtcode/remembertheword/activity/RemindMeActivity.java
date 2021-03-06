package com.zxtcode.remembertheword.activity;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.TimePicker;

import com.zxtcode.remembertheword.R;

/**
 * Created by tarent on 2017/3/14.
 */

public class RemindMeActivity extends WearableActivity {

    private TimePicker mTimePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remind_me);
        mTimePicker = (TimePicker) findViewById(R.id.timePicker);
        mTimePicker.setIs24HourView(true);
    }
}
