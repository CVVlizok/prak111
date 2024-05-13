package com.example.prak111;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // Здесь вы можете выполнить любые необходимые действия при срабатывании будильника
        Log.d("AlarmReceiver", "Alarm triggered!");
    }
}
