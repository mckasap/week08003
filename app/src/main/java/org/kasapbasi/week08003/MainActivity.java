package org.kasapbasi.week08003;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
 Intent myInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     myInt= new Intent(this,myService.class);


    }


    public void StartService(View v){
     myInt.putExtra("ICU","Istanbul Commerce University");
     startService(myInt);

    }

    public void StopService(View v){

        stopService(myInt);
    }
}
