//NAME: SOLOMON MUKHOBE
//REG:CT101/G/19976/23
//DATE:14/02/2025
import java.util.Scanner;

class Vehicle {
    private String brand;
    private String model;
    private int year;

    // Constructor to initialize the fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("----------------");
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
        System.out.println("Year  : " + this.year);
    }
}
class Car extends Vehicle {
    private String fuelType;

    // Constructor to initialize all fields, including those from Vehicle
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Call to Vehicle's constructor
        this.fuelType = fuelType;
    }

    // Override the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the base class method to display common details
        System.out.println("Fuel Type: " + this.fuelType);
    }
}


public class showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for brand
        System.out.print("Enter Car Brand: ");
        String brand = scanner.nextLine();

        // Prompt user for model
        System.out.print("Enter Car Model: ");
        String model = scanner.nextLine();

        // Prompt user for year
        System.out.print("Enter Manufacturing Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Prompt user for fuel type
        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Create an instance of Car
        Car car = new Car(brand, model, year, fuelType);

        System.out.println(); // Blank line for readability

        // Display car information
        car.displayDetails();

        scanner.close();
    }
}
