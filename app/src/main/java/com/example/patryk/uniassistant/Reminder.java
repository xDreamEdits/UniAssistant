package com.example.patryk.uniassistant;

import android.os.Bundle;
import android.widget.EditText;
/**
 * Created by Patryk on 08/12/2016.
 */

public class Reminder extends NewReminder {

    private String reminderTitle;
    private String reminderText;
    private String reminderTime;
    private String reminderDate;

    NewReminder rem = new NewReminder();

 /*   public Reminder(String reminderTitle, String reminderText, String reminderTime, String reminderDate){
        this.reminderTitle = reminderTitle;
        this.reminderText = reminderText;
        this.reminderTime = reminderTime;
        this.reminderDate = reminderDate;


    }*/

    public String getReminderTitle(){
        Bundle extras = getIntent().getExtras();
        String Title = extras.getString("Title");
        System.out.println(Title);
        return extras.getString("Title");
    }

    public String getReminderText(){

        return "a";
    }

    public String getReminderTime(){
        return "a";
    }

    public String getReminderDate(){
        //String Date = rem.getDate();
        return "a";
    }



}
