package com.example.datetimepicker;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TimePicker timePicker;
    TextView textView,textView2;
    DatePicker datePicker;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView1);
        timePicker = findViewById(R.id.time);
//
//        textView = findViewById(R.id.textView2);
//        datePicker = findViewById(R.id.date);
//
//        Calendar calendar= Calendar.getInstance();
//        datePicker.init(
//                calendar.get(Calendar.YEAR),
//                calendar.get(Calendar.MONTH),
//                calendar.get(Calendar.DAY_OF_MONTH),
//                new DatePicker.OnDateChangedListener() {
//                    @Override
//                    public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
//                        textView2.setText("you selected: "+day+"-"+(month+1)+"-"+day);
//                    }
//                });


                  timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {

                    @Override
                 public void onTimeChanged(TimePicker timePicker, int hour, int min) {
                   textView.setText("Hour:"+hour+"\n min:"+min);


                      }
                  });

    }
}