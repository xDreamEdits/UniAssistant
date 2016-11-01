package com.example.patryk.uniassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button Home_Button = (Button) findViewById(R.id.Home_Button);

        Home_Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(MenuActivity.this, MainActivity.class));
                    }
                }
        );

        Button Reminders_Button = (Button) findViewById(R.id.Reminders_Button);

        Reminders_Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(MenuActivity.this, Reminders.class));
                    }
                }
        );

        Button TimetableOpt_Button = (Button) findViewById(R.id.TimetableOpt_Button);

        TimetableOpt_Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(MenuActivity.this, TimetableOptions.class));
                    }
                }
        );
    }
}
