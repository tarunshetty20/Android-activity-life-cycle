package com.example.tarun.cmpe2771;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Dialogcount threadcount;
    Button mfinishb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mfinishb = (Button) findViewById(R.id.finish);
        mfinishb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity B","onStart invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity B","onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Dialogcount app = (Dialogcount) getApplicationContext();
        app.addcounter();
        Log.i("Activity B","onPause invoked");

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity B","onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity B","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity B","onDestroy invoked");
    }

}
