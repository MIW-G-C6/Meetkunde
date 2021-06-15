package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Laten zien hoe de LocalDate klasse ongeveer werkt.
 */
public class LocalDateLauncher {

    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        System.out.println(vandaag);

        LocalDate begin2021 = LocalDate.parse("2021-01-01");
        System.out.println(begin2021);

        LocalDate koningsDag2021 = LocalDate.of(2021, 4, 27);
        System.out.println(koningsDag2021);

        System.out.println(koningsDag2021.getDayOfWeek());

        System.out.println(koningsDag2021.minusYears(2).getDayOfWeek());

        if (koningsDag2021.isAfter(vandaag)) {
            System.out.println("Kijk je al uit naar Koningsdag?!");
        } else if (koningsDag2021.equals(vandaag)) {
            System.out.println("De vlag mag uit het is Koningsdag!");
        } else {
            System.out.println("Koningsdag is geweest, volgend jaar weer een kans, dan is het op: "
                    + koningsDag2021.plusYears(1).getDayOfWeek());
        }
    }

}
