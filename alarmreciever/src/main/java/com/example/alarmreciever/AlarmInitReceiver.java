package com.example.alarmreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.Calendar;

public class AlarmInitReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED) ||
                intent.getAction().equals(Intent.ACTION_LOCALE_CHANGED) ||
                intent.getAction().equals(Intent.ACTION_MY_PACKAGE_REPLACED) ||
                intent.getAction().equals(Intent.ACTION_TIME_CHANGED) ||
                intent.getAction().equals(Intent.ACTION_TIMEZONE_CHANGED)){
//                if (DataModel.reminderIsEnabled()) {
//                    val now = Calendar.getInstance()
//                    Notifications.possiblyAddMissedNotification(now)
//                    Notifications.addAlarm(now, false)
//                } else {
//                    Notifications.possiblyCancelTheNotification()
//                    Notifications.removeAlarm()
//                }
        }
    }
}

