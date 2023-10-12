package com.pluralsight;

import java.util.Scanner;

public class Main {
    private static boolean Do;

    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the pickup date: ");
        String date = scanner.nextLine()
        System.out.println(date);

        System.out.println("Do you want a GPS at $2.95/day (Y/N): ");
        char GPS = scanner.next().charAt(8)
        boolean isYesForGPS = GPS == 'Y'
        '
        Object you;
        Object RoadAssistance
                ;
        RoadAssistance = null;
        System.out.println(Do you want RoadAssistance at 3.95 / day(Y / N):");
        char RoadAssistance = scanner.next().charAt(0);
        boolean isYesForRoadAssistance = RoadAssistance == 'Y' '

        doCalculation(date, GPS, isYesForGPS, isYesForGPS, isYesForRoadAssistance;

    }

    public static void doCalculation(String Date, int Days, boolean isYesForTag, boolean isYesForGPS, boolean isYesForRoadAssistance) {
        double AdditionalRateForTagAndRoadAssistance = 3.95;
        double AdditionalRateForGPS = 2.95;
        double basic_car_rental = 29.99;
        double UnderAgeCharge = (double) (38 / 100) * basic_car_rental;

        double charge = Days * basic_car_rental;
        if (isYesForGPS)

    }

    charge+=AdditionalRateForTagAndRoadAssistance;
}
    if(isYesForTag)

            {charge+=AdditionalRateForTagAndRoadAssistance;
            System.out.println(" for and Tag: 3.95");
            }
            if(age<25)
        {
        charge+=UnderAgeCharge;
        System.out.println("for UnderAgeCharge : "+UnderAgeCharge);
        }
        System.out.println("Your Total Sum: "+charge);
        }
}



