package com.utsa.team8_sum_2017.europa;


//the model class, or any controlling class, should have a list of possible alarms.
//the Alarm class exists as a singular alarm with time variables, not a list of alarms.
public class Alarm {
    private int hour;
    private int minutes;
    private int day; //days are done by int in android
    private boolean enabled;
    private int volume;

    public void setAlarm(int h, int m, int d, int v){
        hour = h;
        minutes = m;
        day = d;
        enabled = true;
        volume = v;
    }
    public void changeAlarm(int h, int m, int d, int v){
        hour = h;
        minutes = m;
        day = d;
        enabled = true;
        volume = v;
    }

    //probably want to delete alarm in the model class, assuming alarms are handled in a list
    //that is controlled by model. just disabling it here for now
    public void deleteAlarm(){ enabled=false;}

    //assuming the control will call the switch depending on what is currently enabled.
    public void toggleAlarm(boolean b){
        enabled = b;
    }

    public void playAlarm(){
        //should turn on the stream at the set volume
    }

    public void stopAlarm(){
        //should disconnect the stream
    }
}
