package com.example.alarmreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent alarm_activity = new Intent(context.getApplicationContext(), AlarmActivity.class);
        alarm_activity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        System.out.println("onReceive");
        context.getApplicationContext().startActivity(alarm_activity);
    }
}
