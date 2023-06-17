package CarServiceApp;

import java.util.HashMap;
import java.util.Map;

public class Service {
    private String code;
    private String name;
    private Map<String, Integer> prices;

    public Service(String code, String name) {
        this.code = code;
        this.name = name;
        this.prices = new HashMap<>();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setPrice(String carType, int price) {
        prices.put(carType, price);
    }

    public int getPrice(String carType) {
        return prices.get(carType);
    }

}
