package ru.ncedu.wortellen.trickytasks2.DateUtil;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DateUtil test = new DateUtil();
        System.out.println(test.getDayOfWeek(2020,10,11));
        System.out.println(test.toString(2020,10,11));
        System.out.println(test.isValidDate(2020,13,10));
        System.out.println(test.countDays(2020,10,8));

    }

}
