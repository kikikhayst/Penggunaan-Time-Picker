package com.sinus.penggunaantimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    TimePicker timePicker;
    Button changeTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.textView2);
        timePicker = (TimePicker) findViewById((R.id.timePicker1));
        timePicker.setIs24HourView(true);
        changeTime = (Button) findViewById(R.id.button1);
        textView1.setText(getCurrentTime());

        changeTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(getCurrentTime());
            }
        });
    }

    public String getCurrentTime() {
        String currentTime = timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
        return currentTime;
    }
}