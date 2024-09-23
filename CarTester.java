
import java.util.Scanner;
public class CarTester {
public static Car addCar() {
    Scanner theScanner = new Scanner(System.in);
    System.out.println("Enter Car Name: ");
    String userCarName = theScanner.nextLine();
    System.out.println("Enter Car's Miles: ");
    int userCarMiles = theScanner.nextInt();
    System.out.println("Enter Car's Gallons: ");
    int userCarGallons = theScanner.nextInt();
    return new Car(userCarName, userCarMiles, userCarGallons);
}
public static void main(String[]args) {
    Car car1 = addCar();
    System.out.println(car1.toString());
    Car car2 = addCar();
    System.out.println(car2.toString());
}
}
/*
 * Enter Car Name: 
Honda Civic
Enter Car's Miles: 
234
Enter Car's Gallons: 
100
Honda Civic averaged 2.3 m/g
Enter Car Name: 
Toad Mobile
Enter Car's Miles: 
13
Enter Car's Gallons: 
7
Toad Mobile averaged 1.9 m/g
 */
