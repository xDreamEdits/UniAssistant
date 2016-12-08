package com.example.patryk.uniassistant;

import android.widget.EditText;

/**
 * Created by Patryk on 08/12/2016.
 */

public class Reminder {

    private String reminderTitle;
    private String reminderText;
    private String reminderTime;
    private String reminderDate;

    public Reminder(String reminderTitle, String reminderText, String reminderTime, String reminderDate){

        this.reminderTitle = Title;
        this.reminderText = Text;
        this.reminderTime = Time;
        this.reminderTime = Date;

    }

    public String getReminderTitle(){
        //EditText title = (EditText)findViewById(R.id.ReminderTitleInput);
        //String Title = title.getText().toString();
        return Title;
    }

    public String getReminderText(){
        //EditText text = (EditText)findViewById(R.id.ReminderTextInput);
        //String Text = text.getText().toString();
        return Text;
    }

    //public String getReminderTime(){
        //return reminderTime;
    //}

    public String getReminderDate(){
        //EditText date = (EditText)findViewById(R.id.DateTextInput);
        //String Date = date.getText().toString();
        return Date;
    }

}
