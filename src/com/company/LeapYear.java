package com.company;

public class LeapYear {
    private int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999) || (year % 4 != 0) || ((year % 100 == 0) && (year % 400 != 0))
                || ((year % 100 != 0) && (year % 400 == 0))) {
            return false;
        }
        return true;
    }
}
