package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LessonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        TextView day, time1, time2, time3, lesson_migalka, lesson1, lesson2, lesson3, room, room1, room2, room3;

        day = findViewById(R.id.dayTextView);
        time1 = findViewById(R.id.time1);
        time2 = findViewById(R.id.time2);
        time3 = findViewById(R.id.time3);

        lesson1 =findViewById(R.id.lesson1);
        lesson2 =findViewById(R.id.lesson2);
        lesson3 =findViewById(R.id.lesson3);
        lesson_migalka =findViewById(R.id.lesson3);

        room = findViewById(R.id.room);
        room1 = findViewById(R.id.room1);
        room2 = findViewById(R.id.room2);
        room3 = findViewById(R.id.room3);

        Intent intent = getIntent();
        if (intent != null) {
            day.setText(intent.getStringExtra("day"));

            time1.setText(intent.getStringExtra("time1"));
            time2.setText(intent.getStringExtra("time2"));
            time3.setText(intent.getStringExtra("time3"));

            lesson1.setText(intent.getStringExtra("lesson1"));
            lesson2.setText(intent.getStringExtra("lesson2"));
            if (lesson_migalka != null) {
                lesson_migalka.setText(intent.getStringExtra("lesson_migalka"));
                room.setText(intent.getStringExtra("room"));
            }
            lesson3.setText(intent.getStringExtra("lesson3"));

            room1.setText(intent.getStringExtra("room1"));
            room2.setText(intent.getStringExtra("room2"));
            room3.setText(intent.getStringExtra("room3"));
        }
    }
}
