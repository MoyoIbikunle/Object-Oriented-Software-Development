//Name: Moyo Ibikunle
//Student ID: C00309427
//Date: 12/10/2025

import java.util.Calendar;// Import Calendar class to get current system time

public class Clock {

    public static void main (String args[])
	{
        int startMinute; // Variable to store the minute when the program starts       
        Calendar cal = Calendar.getInstance();// Get the current date and time from the system
        // Create a Time object using the current hour, minute, and second
        Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
        startMinute = t.getMinute(); // Store the starting minute to track when a minute has passed
        // Run this loop until the minute changes
        while (t.getMinute()==startMinute)
        {
        // (System.currentTimeMillis() gives current time in milliseconds)
        if (System.currentTimeMillis() % 1000 < 5) {
        // roughly at the start of a new second
        t.tick();// Increases the time by one second
        System.out.println(t.toString()); // Print the updated time
    }
        }


    }
 
     
 
}

    
    

