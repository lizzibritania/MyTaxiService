package Console;

import Objects.CreditCard;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Lizzi on 06.01.2017.
 */
public class WriteNewCreditCard {
    public static void main(String[] args) {
        System.out.println("Please write directory");
        Scanner in = new Scanner(System.in);
        String directory= in.nextLine();
        System.out.println("Please write full filename");
        Scanner in1 = new Scanner(System.in);
        String directory1= in1.nextLine();
        directory=directory+directory1;
       try (FileWriter writer = new FileWriter(directory, true)) {
           System.out.println("Please print your cardholder name");
           Scanner cardhname = new Scanner(System.in);
           String holdername=cardhname.nextLine();
           System.out.println("Please print your car credit card number");
           Scanner cardnum = new Scanner(System.in);
           Long cardnumb=Long.parseLong(cardnum.nextLine());
           System.out.println("Please print your car credit card cvv");
           Scanner cvv = new Scanner(System.in);
           int cv=Integer.parseInt(cvv.nextLine());
           System.out.println("Please print your car credit card exriration date");
           Scanner exdate = new Scanner(System.in);
           String expdate=exdate.nextLine();
           CreditCard creditCard=new CreditCard(holdername,expdate,cardnumb,cv);
            writer.write( creditCard.toString()+"\n");


            writer.flush();
           System.out.println("Creditcard succesfully added");
        } catch (IOException ex) {

            System.out.println("Error");

        }
    }
}
