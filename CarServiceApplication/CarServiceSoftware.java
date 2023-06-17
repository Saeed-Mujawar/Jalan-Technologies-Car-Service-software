package CarServiceApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarServiceSoftware {
    public static void main(String[] args) {
        Map<String, Car> carTypes = new HashMap<>();
        carTypes.put("Hatchback", new Car("Hatchback"));
        carTypes.put("Sedan", new Car("Sedan"));
        carTypes.put("SUV", new Car("SUV"));

        Map<String, Service> services = new HashMap<>();
        Service basicService = new Service("BS01", "Basic Servicing");
        basicService.setPrice("Hatchback", 2000);
        basicService.setPrice("Sedan", 4000);
        basicService.setPrice("SUV", 5000);
        services.put("BS01", basicService);

        Service engineFixing = new Service("EF01", "Engine Fixing");
        engineFixing.setPrice("Hatchback", 5000);
        engineFixing.setPrice("Sedan", 8000);
        engineFixing.setPrice("SUV", 10000);
        services.put("EF01", engineFixing);

        Service clutchFixing = new Service("CF01", "Clutch Fixing");
        clutchFixing.setPrice("Hatchback", 2000);
        clutchFixing.setPrice("Sedan", 4000);
        clutchFixing.setPrice("SUV", 6000);
        services.put("CF01", clutchFixing);

        Service brakeFixing = new Service("BF01", "Clutch Fixing");
        brakeFixing.setPrice("Hatchback", 1000);
        brakeFixing.setPrice("Sedan", 1500);
        brakeFixing.setPrice("SUV", 2500);
        services.put("BF01", brakeFixing);

        Service gearFixing = new Service("GF01", "Gear Fixing");
        gearFixing.setPrice("Hatchback", 3000);
        gearFixing.setPrice("Sedan", 6000);
        gearFixing.setPrice("SUV", 8000);
        services.put("GF01", gearFixing);

        CarServiceCenter serviceStation = new CarServiceCenter(carTypes, services);
        GenerateBill generateBill = new GenerateBill(serviceStation);

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose car type from below:" + "\n" + "Sedan" + "\n" + "Hatchback" + "\n" + "SUV");
        String carType = sc.next();

        System.out.println( "Enter number of service needed from below:"+ "\n" +"Basic Servicing" + "\n" + "Engine Fixing" + "\n" + "Clutch Fixing" + "\n" + "Brake Fixing" + "\n" + "Gear Fixing");
        int numberOfService = sc.nextInt();
        System.out.println("Avaliable Service and their code: ");
        System.out.println("Basic Servicing -> BS01");
        System.out.println("Engine Fixing -> EF01");
        System.out.println("Clutch Fixing -> CF01");
        System.out.println("Brake Fixing -> BF01");
        System.out.println("Gear Fixing -> GF01");
        System.out.println();
        String[] serviceCodes = new String[numberOfService];
        for (int i = 0; i < numberOfService; i++) {
            System.out.println("Enter Service Codes " + (i + 1));
            serviceCodes[i] = sc.next();
        }

        generateBill.generateBill(carType, serviceCodes);
    }
}
