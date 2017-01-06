package Objects;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Lizzi on 07.12.2016.
 */
public class CreditCard {
   private String cardHolder;
    private String expirDate;
    private long cardNum;
    private int cvv;

    public CreditCard(String cardHolder, String expirDate, long cardNum, int cvv) {
        this.cardHolder = cardHolder;
        this.expirDate = expirDate;
        this.cardNum = cardNum;
        this.cvv = cvv;
    }

    public CreditCard() {
    }

    @Override
    public String toString() {
        return  cardHolder + ' '
                 + expirDate +' '
                + cardNum +' '
              + cvv ;
    }

    public static void writeNewCard(String cardHolder, String expirDate, long cardNum, int cvv) {
        CreditCard creditCard=new CreditCard(cardHolder,expirDate,cardNum,cvv);

        try (FileWriter writer = new FileWriter("creditCardList.txt", true)) {


            writer.write(creditCard.toString()+"\n");


            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }}


    public static void writeNewCard(CreditCard creditCard) {

        try (FileWriter writer = new FileWriter(" creditCardList.txt", true)) {


            writer.write(creditCard.toString()+"\n");


            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }


}}
