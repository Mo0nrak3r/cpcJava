import java.io.PrintWriter;

public class ListOfCars {
    public static void main(String[] args){
        Car[] cars = new Car[100];
        String[][] models = {
            {"Corolla", "Camry", "Prius", "Yaris", "Avalon"},
            {"Civic", "Accord", "Fit", "CR-V", "Pilot"},
            {"Focus", "Fusion", "Mustang", "Escape", "Explorer"},
            {"Malibu", "Impala", "Camaro", "Equinox", "Tahoe"},
            {"3 Series", "5 Series", "7 Series", "X3", "X5"},
            {"C-Class", "E-Class", "S-Class", "GLA", "GLC"}
        };
        String[] makes = {"Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes"};
        String[] colors = {"Red", "Blue", "Green", "Black", "White", "Gray"};
        
        for (int i = 0; i < cars.length; i++) {
            String make = makes[i % makes.length];
            String model = models[i % makes.length][i % models[i % makes.length].length];
            String color = colors[i % colors.length];
            int year = 2000 + (i % 21); // Year between 2000 and 2020
            double price = 20000 + (i * 300); // Price starting from 20000
            String registrationNumber = "REG" + (1000 + i); // Registration number starting from REG1000
            
            cars[i] = new Car(i, make, model, year, color, price, registrationNumber);
        }
        // for (Car car : cars) {
        //     System.out.println(car.make + " " + car.model + " " + car.year + " " + car.color + " " + car.price + " " + car.licenseNumber);
        // }
        
        PrintWriter pw_out = null;

        // Filter cars by brand
        String filter_brand = "Toyota";

        try {
            pw_out = new PrintWriter("Assignment2/brand_filter.txt");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (Car car : cars){
            if (car.make.equalsIgnoreCase(filter_brand)){
                pw_out.println("ID: " + car.id + ", Make: " + car.make + ", Model: " + car.model + 
                    ", Year: " + car.year + ", Color: " + car.color + 
                    ", Price: " + car.price + ", Registration Number: " + car.licenseNumber);
            }
        }
        pw_out.close();

        // Filter cars by model and age
        String filter_model = "C-Class";
        int filter_age = 5;
        try {
            pw_out = new PrintWriter("Assignment2/model_age_filter.txt");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (Car car : cars){
            if (car.model.equalsIgnoreCase(filter_model) && (2024 - car.year) > filter_age){
                pw_out.println("ID: " + car.id + ", Make: " + car.make + ", Model: " + car.model + 
                    ", Year: " + car.year + ", Color: " + car.color + 
                    ", Price: " + car.price + ", Registration Number: " + car.licenseNumber);
            }
        }
        pw_out.close();

        // Filter cars by year of manufacture and price

        int filter_year = 2015;
        double filter_price = 30000;
        try {
            pw_out = new PrintWriter("Assignment2/year_price_filter.txt");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        for (Car car : cars){
            if (car.year == filter_year && car.price > filter_price){
                pw_out.println("ID: " + car.id + ", Make: " + car.make + ", Model: " + car.model + 
                    ", Year: " + car.year + ", Color: " + car.color + 
                    ", Price: " + car.price + ", Registration Number: " + car.licenseNumber);
            }
        }
        pw_out.close();



    }
}