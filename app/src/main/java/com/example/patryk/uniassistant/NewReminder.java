package com.example.patryk.uniassistant;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TimePicker;
import android.widget.DatePicker;
import android.widget.EditText;

import java.io.PrintWriter;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.*;



public class NewReminder extends AppCompatActivity {

    public static String time;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_reminder);

        final EditText title = (EditText)findViewById(R.id.ReminderTitleInput);
        final EditText text = (EditText)findViewById(R.id.ReminderTextInput);
        final EditText date = (EditText)findViewById(R.id.DateTextInput);

        Button Save_Reminder_Button = (Button) findViewById(R.id.Save_Reminder_Button);

        Save_Reminder_Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        setContentView(R.layout.activity_new_reminder);

                        String Title = title.getText().toString();

                        String Text =  text.getText().toString();

                        String TimeDate = time + " " + date.getText().toString();


                        try{
                            File F = new File(getFilesDir(),"remList.txt");
                            System.out.println(getFilesDir());

                            FileWriter W = new FileWriter(F,false);
                            BufferedWriter B = new BufferedWriter(W);

                            FileReader R = new FileReader(F);
                            BufferedReader BR = new BufferedReader(R);
                            String thisLine;
                            int ID = 1;
                            while((thisLine = BR.readLine())!=null){
                                ID+=1;
                            }

                            B.write(ID + "\n" + Title + "\n" + Text + "\n" + TimeDate + "\n");
                            B.close();W.close();






                        }
                        catch(Exception e){
                            System.out.println("File Empty");
                        }



                        //Reminder x = new Reminder();
                        //x.getReminderTitle();

                        //startActivity(new Intent(NewReminder.this, MainActivity.class));

                    }
                }
        );


    }

    public String getTime(){

        return "abs";
    }

    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");

    }







}
