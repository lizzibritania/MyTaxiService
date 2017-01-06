package Console;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Lizzi on 06.01.2017.
 */
public class ReadFromFile {
    public static void main(String[] args) {
        System.out.println("Please enter directory:");
        Scanner in = new Scanner(System.in);
        String directory= in.nextLine();
        ReadFromFile.readFile(directory);
    }

    public static void readFile(String directory) {


        Scanner scanner = null;
        int counter=0;
        try {
            scanner = new Scanner(new File(directory));
            while (scanner.hasNext()) {

                String line = scanner.nextLine();


                System.out.println(line);}
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }}

