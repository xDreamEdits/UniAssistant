package com.example.patryk.uniassistant;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TimePicker;
import android.widget.DatePicker;
import android.widget.EditText;

public class NewReminder extends AppCompatActivity {

    public static String time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_reminder);

        Button Save_Reminder_Button = (Button) findViewById(R.id.Save_Reminder_Button);
        EditText inputTxt1 = (EditText) findViewById(R.id.ReminderTitleInput);
        String Title = inputTxt1.getText().toString();

        EditText inputTxt2 = (EditText) findViewById(R.id.ReminderTextInput);
        String reminder = inputTxt2.getText().toString();

        Save_Reminder_Button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                       startActivity(new Intent(NewReminder.this, MainActivity.class));
                    }
                }
        );
    }

    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }



    //int hour = timePicker.getCurrentHour();
    //int min = timePicker.getCurrentMinute();
    //int time = hour,min;

    EditText inputTxt3 = (EditText) popupView.findViewById(R.id.DateTextInput);
    String date = inputTxt3 = inputTxt3.getText().toString();

}
