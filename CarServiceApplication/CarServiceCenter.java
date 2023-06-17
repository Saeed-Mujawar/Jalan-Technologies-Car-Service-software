package CarServiceApp;

import java.util.Map;

public class CarServiceCenter {
    private Map<String, Car> carTypes;
    private Map<String, Service> services;

    public CarServiceCenter(Map<String, Car> carTypes, Map<String, Service> services) {
        this.carTypes = carTypes;
        this.services = services;
    }

    public int getServicePrice(String serviceCode, String carType) {
        Service service = services.get(serviceCode);
        return service.getPrice(carType);
    }
}
