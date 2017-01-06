import Objects.CreditCard;

/**
 * Created by Lizzi on 06.01.2017.
 */
public class FileReadingAndWriting {

    public static void main(String[] args) {


        CreditCard creditCard=new CreditCard("dsds", "12/12/12", 132223434241321312L, 123);
        CreditCard.writeNewCard(creditCard);
        CreditCard.writeNewCard(creditCard);
        CreditCardList creditCardList=new CreditCardList();
        creditCardList.readList( " creditCardList.txt" );


    }

}
