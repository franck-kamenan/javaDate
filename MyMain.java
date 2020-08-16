package be.intecbrussel.javaDate;

import be.intecbrussel.javaEnums.MyLevel;
import be.intecbrussel.javaInterface.MyPig;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyMain
{
    public static void main(String[] args)
    {
        LocalDate maDate = LocalDate.now();
        System.out.println(maDate);
        LocalTime monTemps = LocalTime.now();
        System.out.println(monTemps);
        LocalDateTime dateEtTemps = LocalDateTime.now();
        System.out.println(dateEtTemps);
        System.out.println("Before formatting: " + dateEtTemps);
        DateTimeFormatter myFormatObject = DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm:ss");
        String formattedDate = dateEtTemps.format(myFormatObject);
        System.out.println("After formatting: " + formattedDate);

    }


}
