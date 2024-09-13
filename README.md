Car: -------------------------------------------------------
public class Car {
    private String carName;
    private int milesDriven;
    private int gallonsUsed;
    public Car() {
        this.carName = "";
        this.milesDriven = 0;
        this.gallonsUsed = 0;
    }
    public Car(String carName, int milesDriven, int gallonsUsed) {
        this.carName = carName; 
        this.milesDriven = milesDriven;
        this.gallonsUsed = gallonsUsed;
    }
    public String getCarName() {
        return carName;
    }
    public int getmilesDriven() {
        return milesDriven;
    }
    public int getgallonsUsed() {
        return gallonsUsed;
    }
    public double calculateAverage() {
        double average = (double)milesDriven/gallonsUsed;
        return Math.round(average * 10.0) / 10.0;
    }
    public String toString() {
        String carNameSpeech = carName + " averaged " + 
        this.calculateAverage() + " m/g";
        return carNameSpeech;
    }
}
CarTester: -------------------------------------------------------
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

