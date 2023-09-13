
/**
 * Write a description of class MySolutions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MySolutions {
    public void celsiusToFahrenheit() {
       double CEL = 30.0;
       double FAHR = 0.0;
       FAHR = CEL * 9.0/5.0 + 32;
       System.out.println(CEL+"°C = " + FAHR +"°F");
    }
    
    public void elapsedTime() {  
       int Hours = 10;
       int Mins = 50;
       int seconds = 0;
       int SecMN = 0;
       int SecLeft = 0;
       double percentLeft = 0.0;
       
       System.out.println("The current time is "+ Hours + ":" + Mins + ":" + seconds);
       SecMN = Hours * 3600 + Mins * 60 + seconds;
       System.out.println("It has been: " + SecMN + " seconds since the day began");
       SecLeft = 24 * 3600 - SecMN;
       System.out.println("There are "+ SecLeft + " seconds left in the day");
       percentLeft = (double)SecMN/86400 * 100;
       System.out.println("The day is " + percentLeft + "% done");
       
    }
    
    public void secondsToHMS() { 
        int seconds = 50000;
        int minutes = 0;
        int hours = 0;
        int SECRM = 0;
        hours = seconds / 3600;
        minutes = seconds % 3600/60;
        SECRM = seconds - hours*3600 - minutes*60;
        System.out.println(seconds + "seconds = " + hours + " hours, " + minutes + " minutes, and " + SECRM + " seconds");
    }
}
