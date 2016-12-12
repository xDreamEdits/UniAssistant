package com.example.patryk.uniassistant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class readReminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_read_reminder);

        ShowReminders textPoint = new ShowReminders();
        String[] FinalArray = textPoint.READALL();
        textPoint.READALL();
        System.out.println("FINAL ARRAAAAAAY ==== " + FinalArray[0]);

        RelativeLayout relLay = new RelativeLayout(this);

        TextView TitleTextView = new TextView(this);
        TitleTextView.setText(FinalArray[0]);
        TitleTextView.setTextSize(16);

        TextView TextTextView = new TextView(this);
        TextTextView.setText(FinalArray[1]);
        TextTextView.setTextSize(12);

        TextView DateTimeTextView = new TextView(this);
        DateTimeTextView.setText(FinalArray[2]);
        DateTimeTextView.setTextSize(12);

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
}
