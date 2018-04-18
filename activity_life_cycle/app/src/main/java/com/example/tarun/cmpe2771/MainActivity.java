package com.example.tarun.cmpe2771;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private Dialogcount threadcount;
    Button mstartB;
    Button mclose;
    Button mdialog;
    TextView mthreadtextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          Dialogcount app = (Dialogcount) getApplicationContext();
          app.setCounter(0);
        mstartB = (Button)findViewById(R.id.startactivityb);
        mstartB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
            }
        });
        mthreadtextview = (TextView) findViewById(R.id.counter);
        mthreadtextview.setText("Thread Counter : " + app.getCounter());


        mclose = (Button) findViewById(R.id.closeapp);
        mclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Close App");
                alert.setCancelable(true);
                alert.setMessage("Application will be closed");
                alert.setPositiveButton("Close App", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }
                });
                alert.show();
            }
        });
        Log.i("Activity A","onCreate invoked");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity A","onStart invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity A","onResume invoked");
        Dialogcount app = (Dialogcount) getApplicationContext();
        mthreadtextview.setText("Thread Counter : " + app.getCounter());
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity A","onPause invoked");
        Dialogcount app = (Dialogcount) getApplicationContext();
        app.addcounter();
        mthreadtextview.setText("Thread Counter : " + app.getCounter());
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity A","onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Dialogcount app = (Dialogcount) getApplicationContext();
        Log.i("Activity A","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity A","onDestroy invoked");
    }
    public void startDialog(View v) {
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }
}
