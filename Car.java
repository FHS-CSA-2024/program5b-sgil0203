
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
