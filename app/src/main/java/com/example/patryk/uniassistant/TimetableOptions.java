package com.example.patryk.uniassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class TimetableOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable_options);


        Button Home_Button = (Button) findViewById(R.id.Home_Button);

        Home_Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(TimetableOptions.this, MainActivity.class));
                    }

                }
        );

        Button Create_New_Timetable_Button = (Button) findViewById(R.id.Create_New_Timetable_Button);

        Create_New_Timetable_Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(TimetableOptions.this, NewTimetable.class));
                    }
                }
        );
    }
}
