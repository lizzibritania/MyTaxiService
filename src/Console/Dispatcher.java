package Console; /**
 * Created by Юля on 27.12.2016.
 */
import Lists.OrderList;

import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {
        OrderList orderList=new OrderList();
        System.out.println(" Hello, please enter your name:");
        Scanner name = new Scanner(System.in);
        System.out.println(" Hello, please enter your phone number:");
        Scanner phonenum = new Scanner(System.in);
        System.out.println(" if you are taxi driver - enter 1, else enter 2 ");

        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        if (num==1) {
            System.out.println("Please print your car brand");
            Scanner brand = new Scanner(System.in);
            System.out.println("Please print your car model");
            Scanner model = new Scanner(System.in);
            System.out.println("Please print your car Class");
            Scanner carclass = new Scanner(System.in);
            System.out.println("Please print your car gov number");
            Scanner govnum = new Scanner(System.in);
            System.out.println("Please print your car credit card number");
            Scanner cardnum = new Scanner(System.in);
            System.out.println("Please print your car credit card cvv");
            Scanner cvv = new Scanner(System.in);
            System.out.println("Please print your car credit card exriration date");
            Scanner exdate = new Scanner(System.in);

        }
        else if (num==2)
        {
            System.out.println("Please print your car credit card number");
            Scanner cardnum = new Scanner(System.in);
            System.out.println("Please print your car credit card cvv");
            Scanner cvv = new Scanner(System.in);
            System.out.println("Please print your car credit card exriration date");
            Scanner exdate = new Scanner(System.in);

        }


    }
}


