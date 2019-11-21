package com.example.timetable;

public class TimeTableItem {

    private String day;
    private String time1;
    private String time2;
    private String time3;
    private String lesson1;
    private String lesson2;
    private String lesson3;
    private String lesson_migalka;
    private int room;
    private int room1;
    private int room2;
    private int room3;

    public TimeTableItem(String day, String time1, String time2, String time3, String lesson1, String lesson2, String lesson3, String lesson_migalka, int room1, int room2, int room, int room3) {
        this.day = day;
        this.time1 = time1;
        this.time2 = time2;
        this.time3 = time3;
        this.lesson1 = lesson1;
        this.lesson2 = lesson2;
        this.lesson3 = lesson3;
        this.lesson_migalka = lesson_migalka;
        this.room1 = room1;
        this.room2 = room2;
        this.room = room;
        this.room3 = room3;
    }

    public TimeTableItem(String day, String time1, String time2, String time3, String lesson1, String lesson2, String lesson3, int room1, int room2, int room3) {
        this.day = day;
        this.time1 = time1;
        this.time2 = time2;
        this.time3 = time3;
        this.lesson1 = lesson1;
        this.lesson2 = lesson2;
        this.lesson3 = lesson3;
        this.room1 = room1;
        this.room2 = room2;
        this.room3 = room3;
    }



    public String getDay() {
        return day;
    }

    public String getTime1() {
        return time1;
    }

    public String getTime2() {
        return time2;
    }

    public String getTime3() {
        return time3;
    }

    public String getLesson1() {
        return lesson1;
    }

    public String getLesson2() {
        return lesson2;
    }

    public String getLesson3() {
        return lesson3;
    }

    public String getLesson_migalka() {
        return lesson_migalka;
    }

    public int getRoom() {
        return room;
    }

    public int getRoom1() {
        return room1;
    }

    public int getRoom2() {
        return room2;
    }

    public int getRoom3() {
        return room3;
    }
}
