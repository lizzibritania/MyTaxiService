/**
 * Created by Lizzi on 07.12.2016.
 */
public class Car {
   private String brand;
    private String model;
    private String carClass;
    private String govNum;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getGovNum() {
        return govNum;
    }

    public void setGovNum(String govNum) {
        this.govNum = govNum;
    }

    public Car(String brand, String model, String carClass, String govNum) {

        this.brand = brand;
        this.model = model;
        this.carClass = carClass;
        this.govNum = govNum;
    }
}
