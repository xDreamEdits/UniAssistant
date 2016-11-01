package com.example.patryk.uniassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewTimetable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_timetable);

        Button Home_Button = (Button) findViewById(R.id.Home_Button);

        Home_Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(NewTimetable.this, MainActivity.class));
                    }
                }
        );

     //   Button Time_Start_Input_Button = (Button) findViewById(R.id.Time_Start_Input_Button);

     //   Time_Start_Input_Button.setOnClickListener(
         //       new View.OnClickListener(){

        //        }
       // );
    }
}
