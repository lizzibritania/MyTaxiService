import Objects.CreditCard;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 * Created by Lizzi on 06.01.2017.
 */
public  class CreditCardList {
    @Override
    public String toString() {
        return "CreditCardList{" +
                "creditCardList=" + creditCardList +
                '}';
    }

    ArrayList<CreditCard> creditCardList=new ArrayList<>();

    public  void addCreditCard(CreditCard creditCard) {
        creditCardList.add(creditCard);
    }

    public void readList(String directory) {


    Scanner scanner = null;
int counter=0;
    try {
        scanner = new Scanner(new File(directory));
        while (scanner.hasNext()) {
            counter++;
            String line = scanner.nextLine();

            String[] string = line.split(" ");
            long number=Long.parseLong(string[2]);
            int cvv=Integer.parseInt(string[3]);

            CreditCard creditCard=new CreditCard(string[0],string[1],number,cvv);

            creditCardList.add(creditCard);
        }
        System.out.println(counter+" items were added in the list");

    } catch (FileNotFoundException e) {
        System.out.println(" File not found");
    }
       }}







