package com.example.timetable;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TimeTableAdapter extends RecyclerView.Adapter<TimeTableAdapter.TimeTableViewHolder> {

    private ArrayList<TimeTableItem> timeTableItems;
    private Context context;

    public TimeTableAdapter(ArrayList<TimeTableItem> timeTableItems, Context context) {
        this.timeTableItems = timeTableItems;
        this.context = context;
    }

    @NonNull
    @Override
    public TimeTableAdapter.TimeTableViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.time_table_item, viewGroup, false);
        return new TimeTableViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TimeTableAdapter.TimeTableViewHolder viewHolder, int position) {
        TimeTableItem timeTableItem = timeTableItems.get(position);

        viewHolder.tvTitle.setText(timeTableItem.getDay());
    }

    @Override
    public int getItemCount() {
        return timeTableItems.size();
    }

    public class TimeTableViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView tvTitle;

        private TimeTableViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            tvTitle = itemView.findViewById(R.id.tvTitle);
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
