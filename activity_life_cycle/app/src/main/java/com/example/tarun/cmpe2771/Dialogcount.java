package com.example.tarun.cmpe2771;

import android.app.Application;

/**
 * Created by tarun on 15-02-2018.
 */

public class Dialogcount extends Application{
    private int counter ;

    public int getCounter(){
        return counter;
    }
    public void setCounter(int a)
    {
     this.counter=a;
    }
    public int addcounter(){
        counter++;
        return counter;
    }
}
