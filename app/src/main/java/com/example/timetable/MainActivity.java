package com.example.timetable;

import android.os.Bundle;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        db = FirebaseFirestore.getInstance();

        ArrayList<TimeTableItem> timeTableItems = new ArrayList<>();
        timeTableItems.add(new TimeTableItem(Utils.day1, Utils.time1, Utils.time2, Utils.time3, Utils.Monday_lesson1, Utils.Monday_lesson2, Utils.Monday_lesson3, Utils.room321, Utils.room325, Utils.room319));
        timeTableItems.add(new TimeTableItem(Utils.day2, Utils.time1, Utils.time2, Utils.time3, Utils.Tuesday_lesson1, Utils.Tuesday_lesson2, Utils.Tuesday_lesson3_migalka, Utils.Tuesday_lesson3, Utils.room109, Utils.room303, Utils.room, Utils.room212));
        timeTableItems.add(new TimeTableItem(Utils.day3, Utils.time1, Utils.time2, Utils.time3, Utils.Monday_lesson1, Utils.Monday_lesson2, Utils.Monday_lesson3, Utils.room321, Utils.room325, Utils.room319));
        timeTableItems.add(new TimeTableItem(Utils.day4, Utils.time1, Utils.time2, Utils.time3, Utils.Monday_lesson1, Utils.Monday_lesson2, Utils.Monday_lesson3, Utils.room321, Utils.room325, Utils.room319));
        timeTableItems.add(new TimeTableItem(Utils.day5, Utils.time1, Utils.time2, Utils.time3, Utils.Monday_lesson1, Utils.Monday_lesson2, Utils.Monday_lesson3, Utils.room321, Utils.room325, Utils.room319));
        timeTableItems.add(new TimeTableItem(Utils.day6, Utils.time1, Utils.time2, Utils.time3, Utils.Monday_lesson1, Utils.Monday_lesson2, Utils.Monday_lesson3, Utils.room321, Utils.room325, Utils.room319));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new TimeTableAdapter(timeTableItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

}
