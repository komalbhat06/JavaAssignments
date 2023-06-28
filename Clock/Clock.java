package com.example;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean isAM;

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        isAM = true;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 12) {
            this.hours = hours;
        } else {
            System.out.println("Invalid hours. Hours must be between 0 and 12.");
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("Invalid minutes. Minutes must be between 0 and 59.");
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            System.out.println("Invalid seconds. Seconds must be between 0 and 59.");
        }
    }

    public void setAM(boolean isAM) {
        this.isAM = isAM;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isAM() {
        return isAM;
    }

    public void displayTime() {
        String amPm = isAM ? "AM" : "PM";
        System.out.printf("%02d:%02d:%02d %s\n", hours, minutes, seconds, amPm);
    }
}

