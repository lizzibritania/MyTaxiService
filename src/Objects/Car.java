package Objects;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Lizzi on 07.12.2016.
 */
public class Car {
   private String brand;
    private String model;
    private String carClass;
    private String govNum;


    public Car(String brand, String model, String carClass, String govNum) {

        this.brand = brand;
        this.model = model;
        this.carClass = carClass;
        this.govNum = govNum;
    }


    @Override
    public String toString() {
        return  brand + ' ' +
                model + ' '+
              carClass + ' ' +
                govNum;}

    public static void writeNewCar(String brand, String model, String carClass, String govNum) {
        Car car=new Car(brand, model,  carClass, govNum);



        try (FileWriter writer = new FileWriter(" CarList.txt", true)) {

            writer.write(car.toString()+"\n");
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }}


    public static void writeNewCar(Car car) {

        try (FileWriter writer = new FileWriter(" CarList.txt", true)) {

            writer.write(car.toString()+"\n");
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }}
}
