package com.example.patryk.uniassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reminders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminders);

        Button Home_Button = (Button) findViewById(R.id.Home_Button);
        Home_Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(Reminders.this, MainActivity.class));
                    }
                }
        );

        Button Add_Reminder_Button = (Button) findViewById(R.id.Add_Reminder_Button);
        Add_Reminder_Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(Reminders.this, NewReminder.class));
                    }
                }
        );

    }
}
