package com.example.timetable;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TimeTableAdapter extends RecyclerView.Adapter<TimeTableAdapter.TimeTableViewHolder> {

    ArrayList<TimeTableItem> timeTableItems;
    Context context;

    public TimeTableAdapter(ArrayList<TimeTableItem> timeTableItems, Context context) {
        this.timeTableItems = timeTableItems;
        this.context = context;
    }

    @NonNull
    @Override
    public TimeTableAdapter.TimeTableViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.time_table_item, viewGroup, false);
        TimeTableViewHolder timeTableViewHolder = new TimeTableViewHolder(view);
        return timeTableViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TimeTableAdapter.TimeTableViewHolder viewHolder, int position) {
        TimeTableItem timeTableItem = timeTableItems.get(position);

        viewHolder.button.setText(timeTableItem.getDay());
    }

    @Override
    public int getItemCount() {
        return timeTableItems.size();
    }

    public class TimeTableViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public Button button;

        public TimeTableViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            button = itemView.findViewById(R.id.button);
        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            TimeTableItem timeTableItem = timeTableItems.get(position);

            Intent intent = new Intent(context, LessonsActivity.class);
            intent.putExtra("time1", timeTableItem.getTime1());
            intent.putExtra("time2", timeTableItem.getTime2());
            intent.putExtra("time3", timeTableItem.getTime3());
            intent.putExtra("lesson1", timeTableItem.getLesson1());
            intent.putExtra("lesson2", timeTableItem.getLesson2());
            intent.putExtra("lesson3", timeTableItem.getLesson3());
            intent.putExtra("room", timeTableItem.getRoom());
            intent.putExtra("room1", timeTableItem.getRoom1());
            intent.putExtra("room2", timeTableItem.getRoom2());
            intent.putExtra("room3", timeTableItem.getRoom3());

            context.startActivity(intent);
        }
    }

}
