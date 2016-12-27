/**
 * Created by Lizzi on 07.12.2016.
 */
public class TaxiDriver extends Person{
Car car;
    CreditCard creditCard;

    public TaxiDriver(String fName, String lName, long phoneNum, Car car, CreditCard creditCard) {
        super(fName, lName, phoneNum);
        this.car = car;
        this.creditCard = creditCard;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
