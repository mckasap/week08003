package org.kasapbasi.week08003;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by mcemkasapbasi on 12.04.2018.
 */

public class myService extends Service {

    String str;
    IBinder myBinder;

    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getBaseContext(),str +"  BİTTI",Toast.LENGTH_LONG).show();

        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        str= intent.getExtras().getString("ICU");

        Toast.makeText(getBaseContext(),str +" BASLADI",Toast.LENGTH_LONG).show();

        return super.onStartCommand(intent, flags, startId);


    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return myBinder;
    }
}
