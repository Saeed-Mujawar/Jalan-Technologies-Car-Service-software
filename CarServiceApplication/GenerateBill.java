package CarServiceApp;

public class GenerateBill {
    private CarServiceCenter serviceStation;

    public GenerateBill(CarServiceCenter serviceStation) {
        this.serviceStation = serviceStation;
    }

    public void generateBill(String carType, String[] serviceCodes) {
        System.out.println("Type of Car- " + carType);

        System.out.println("Service Codes- " + String.join(", ", serviceCodes));

        int totalBill = 0;

        System.out.println();

        for (String serviceCode : serviceCodes) {
            int servicePrice = serviceStation.getServicePrice(serviceCode, carType);
            System.out.println("Charges for " + serviceCode + "- ₹ " + servicePrice);
            totalBill = totalBill + servicePrice;
        }

        System.out.println("Total Bill- ₹ " + totalBill);

        if (totalBill > 10000) {
            System.out.println("Complimentary cleaning service is offered at no additional cost !!!!");
        }
    }
}
