package ru.ncedu.wortellen.trickytasks2.DateUtil;

import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;
import java.time.LocalDate;


public class DateUtil {
    boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
    boolean isValidDate(int year, int month, int day) {
        try {
            LocalDate d = LocalDate.of(year,month,day);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }

    }

    int getDayOfWeek(int year, int month, int day){
        LocalDate d = LocalDate.of(year,month,day);
        DayOfWeek dayOfWeek = d.getDayOfWeek();
        int value = dayOfWeek.getValue();
        return value-1;

    }
    String toString(int year, int month, int day){
        LocalDate d = LocalDate.of(year,month,day);
        DayOfWeek dayOfWeek = d.getDayOfWeek();
        int value = dayOfWeek.getValue();
        String dayofweek ="";
        switch (value) {
            case 1:
                dayofweek ="Monday";
                break;
            case 2:
                dayofweek ="Tuesday";
                break;
            case 3:
                dayofweek ="Wednesday";
                break;
            case 4:
                dayofweek ="Thursday";
                break;
            case 5:
                dayofweek ="Friday";
                break;
            case 6:
                dayofweek ="Saturday";
                break;
            case 7:
                dayofweek ="Sunday";
                break;
        }
        String monthS="";
        switch (month) {
            case 1:
                monthS ="January";
                break;
            case 2:
                monthS ="February";
                break;
            case 3:
                monthS ="March";
                break;
            case 4:
                monthS ="April";
                break;
            case 5:
                monthS ="May";
                break;
            case 6:
                monthS ="June";
                break;
            case 7:
                monthS ="July";
                break;
            case 8:
                monthS ="August";
                break;
            case 9:
                monthS ="September";
                break;
            case 10:
                monthS ="October";
                break;
            case 11:
                monthS ="November";
                break;
            case 12:
                monthS ="December";
                break;

        }
        return dayofweek+" "+day+" "+monthS+" "+year;
    }
    int countDays(int year, int month, int day){
        LocalDate now = LocalDate.now();
        LocalDate d = LocalDate.of(year,month,day);
        return (int)ChronoUnit.DAYS.between(d,now);
    }
}
