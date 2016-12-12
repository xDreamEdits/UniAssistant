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

                        String Text = text.getText().toString();

                        String Date = date.getText().toString();

                        Intent intent = new Intent(NewReminder.this, Reminder.class);
                        intent.putExtra("Title", Title);
                        intent.putExtra("Text", Text);
                        intent.putExtra("Date", Date);

                        Reminder x = new Reminder();
                        x.getReminderTitle();


                        startActivity(new Intent(NewReminder.this, MainActivity.class));
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
