package Objects;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Юля on 07.12.2016.
 */
public class Order {
    private TaxiDriver taxiDriver;
    private TaxiUser taxiUser;
    private Date date;
    private Time time;
    private double distance;
    private double price;

    public Order(TaxiDriver taxiDriver, TaxiUser taxiUser, Date date, Time time, double distance, double price) {
        this.taxiDriver = taxiDriver;
        this.taxiUser = taxiUser;
        this.date = date;
        this.time = time;
        this.distance = distance;
        this.price = price;
    }
}
