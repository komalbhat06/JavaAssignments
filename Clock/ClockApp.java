package com.example;

public class ClockApp{
    public static void main(String[] args) {
        Clock clock = new Clock(10, 30, 45);
        clock.displayTime();

        clock.setHours(13);
        clock.setMinutes(45);
        clock.setSeconds(49); 

        clock.setAM(false);
        clock.displayTime();
    }
}

