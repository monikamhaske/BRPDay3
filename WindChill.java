package BRPDay3;
import java.util.Scanner;
public class WindChill {
    Scanner scan = new Scanner(System.in);

    double temp, windSpeed, windChill;

    System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:");
    temp = scan.nextDouble();

    System.out.print("Enter the wind speed (>=2) in miles per hour: ");
    windSpeed = scan.nextDouble();

    if (temp < -58 || temperature > 41) {
        System.out.println ("The temperature you entered is invalid.");
    }

    if (windSpeed < 2) {
        System.out.println ("The wind speed you entered is invalid.");
    }

    else {

        windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow(windSpeed, 0.16);

        System.out.print("The wind chill index is " + windChill);
    }
}
}
