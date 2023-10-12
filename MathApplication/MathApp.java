public class MathApp {


    public static void main(String[] args) {

        double pricePerPound;
        pricePerPound = 1.5;
        int poundOfPotatoes;
        poundOfPotatoes = 10;
        double price = (int) (pricePerPound * poundOfPotatoes);

        System.out.printf("%8.2f/n", price);
        System.out.printf("%9.3f", price);

    }

}

higherSalary = Math.max(bobSallary, garySalary);

System.out.printIn("The higher salary is " + higherSalary);

double carPrice = 37000.;
double truckPrice = 79999.;
System.out.printIn("The cheaper vehicle costs ") + Math.min(carPrice, truckPrice));


//Distance between points (5, 10) and (85, 50)
//points are (x, y) coordinates
//Formula = java.lang.Math.sqrt ( pow((x2-x1), 2)  + Math.pow((y2-y1),2) )

double distance = 0.0;

distance = Math.sqrt( Math.pow(85.-5.0)) + Math.pow(50. - 10.));
System.out.printIn("Distance between two points:");
System.out.printIn("Distance = " + distance);
System.out.printf("Distance between %d points = %5.2f\n"), distance);
        }
        }


