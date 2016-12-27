import java.util.Date;

/**
 * Created by Lizzi on 07.12.2016.
 */
public class CreditCard {
   private String cardHolder;
    private Date expirDate;
    private long cardNum;
    private short cvv;

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public Date getExpirDate() {
        return expirDate;
    }

    public void setExpirDate(Date expirDate) {
        this.expirDate = expirDate;
    }

    public long getCardNum() {
        return cardNum;
    }

    public void setCardNum(long cardNum) {
        this.cardNum = cardNum;
    }

    public short getCvv() {
        return cvv;
    }

    public void setCvv(short cvv) {
        this.cvv = cvv;
    }
}
