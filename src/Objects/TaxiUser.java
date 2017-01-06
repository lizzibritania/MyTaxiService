package Objects;

/**
 * Created by Lizzi on 07.12.2016.
 */
public class TaxiUser extends Person{
    long idNum;
    CreditCard creditCard;
    String pass;

    public long getIdNum() {
        return idNum;
    }

    public void setIdNum(long idNum) {
        this.idNum = idNum;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public TaxiUser(String fName, String lName, long phoneNum, long idNum, CreditCard creditCard, String pass) {
        super(fName, lName, phoneNum);
        this.idNum = idNum;
        this.creditCard = creditCard;
        this.pass = pass;
    }
}
