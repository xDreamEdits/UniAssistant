package com.example.patryk.uniassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.widget.TextView;
import android.widget.RelativeLayout;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ShowReminders extends AppCompatActivity {
    public String a;
    public String b;
    public String c;
    public String[] ReminderTitles = new String[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_reminders);

        try {
            File F = new File(getFilesDir(), "remList.txt");

            FileWriter W = new FileWriter(F, true);
            BufferedWriter B = new BufferedWriter(W);

            FileReader RN = new FileReader(F);
            BufferedReader BRN = new BufferedReader(RN);
            int ID = 1;
            while (BRN.readLine() != null) {
                ID += 1;
            }

            FileReader R = new FileReader(F);
            BufferedReader BR = new BufferedReader(R);
            String thisLine;



            int counter = 1;
            while((thisLine = BR.readLine())!=null){
                System.out.println(thisLine);

                if (counter == 2){
                    a = thisLine;
                    ReminderTitles[0] = a;
                    System.out.println("RT:" + ReminderTitles[0]);
                    counter ++;
                }
                else if (counter == 3){
                    b = thisLine;
                    ReminderTitles[1] = b;
                    System.out.println("RT:" + ReminderTitles[0] + ReminderTitles[1]);
                    counter ++;
                }
                else if (counter == 4){
                    c = thisLine;
                    ReminderTitles[2] = c;
                    System.out.println("RT:" + ReminderTitles[0] + ReminderTitles[1] + ReminderTitles[2]);
                }
                else {
                    counter ++;
                }



                RelativeLayout showRemLayout = new RelativeLayout(this);

                TextView textView = new TextView(this);
                textView.setText("Reminder List:");
                textView.setTextSize(24);



                RelativeLayout relLay = new RelativeLayout(this);

                TextView TitleTextView = new TextView(this);
                TitleTextView.setText(ReminderTitles[0]);
                TitleTextView.setTextSize(36);

                TextView TextTextView = new TextView(this);
                TextTextView.setText(ReminderTitles[1]);
                TextTextView.setTextSize(24);

                TextView DateTimeTextView = new TextView(this);
                DateTimeTextView.setText(ReminderTitles[2]);
                DateTimeTextView.setTextSize(24);

                RelativeLayout.LayoutParams TextViewDetails1 = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );

                RelativeLayout.LayoutParams TextViewDetails2 = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );

                RelativeLayout.LayoutParams TextViewDetails3 = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );

                TextViewDetails1.addRule(RelativeLayout.CENTER_HORIZONTAL);
                //TextViewDetails1.addRule(RelativeLayout.ABOVE);

                TextViewDetails2.addRule(RelativeLayout.CENTER_HORIZONTAL);
                TextViewDetails2.addRule(RelativeLayout.CENTER_VERTICAL);

                TextViewDetails3.addRule(RelativeLayout.CENTER_HORIZONTAL);
                TextViewDetails3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);


                relLay.addView(TitleTextView,TextViewDetails1);
                relLay.addView(TextTextView,TextViewDetails2);
                relLay.addView(DateTimeTextView,TextViewDetails3);

                setContentView(relLay);
            }



        } catch (Exception e) {System.out.println("Error");
        }




    }

    public String[] READALL() {
        try {
            File F2 = new File(getFilesDir(), "remList.txt");
            FileReader RN2 = new FileReader(F2);
            BufferedReader BRN2 = new BufferedReader(RN2);
            int ID = 1;
            while (BRN2.readLine() != null) {
                ID += 1;
            }

            FileReader R2 = new FileReader(F2);
            BufferedReader BR2 = new BufferedReader(R2);
            String thisLine;

            int counter = 1;
            while((thisLine = BR2.readLine())!=null){
                System.out.println(thisLine);

                if (counter == 2){
                    a = thisLine;
                    ReminderTitles[0] = a;
                    System.out.println("RT:" + ReminderTitles[0]);
                    counter ++;
                }
                else if (counter == 3){
                    b = thisLine;
                    ReminderTitles[1] = b;
                    System.out.println("RT:" + ReminderTitles[0] + ReminderTitles[1]);
                    counter ++;
                }
                else if (counter == 4){
                    c = thisLine;
                    ReminderTitles[2] = c;
                    System.out.println("RT:" + ReminderTitles[0] + ReminderTitles[1] + ReminderTitles[2]);
                }
                else {
                    counter ++;
                }
            return ReminderTitles;}




    }
        catch (Exception e){

        }
        return ReminderTitles;
    }


    public String GetA() {
        return a;
    }

    public String GetB(){
        return b;
    }

    public String GetC(){
        return c;
    }







    //ListView listView = (ListView) findViewById(R.id.LVSimple);
    //ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ReminderTitles);




}
