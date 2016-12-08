package com.example.patryk.uniassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.Window;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Continue_Button = (Button) findViewById(R.id.Continue_Button);

        Continue_Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(MainActivity.this, MenuActivity.class));
                    }
                }
        );
    }

    //public void save(View v){
        //ArrayList<Reminder> reminders = new ArrayList<>();
        //File file = new File();
        //for (reminder in reminders){
            //file.write(reminder);
        //}
    //}

}
