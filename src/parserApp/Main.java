package parserApp;

import parsertools.Parser;
import parsertools.Ref;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Ref<Integer> out = new Ref<>(); 	// create instance of ref object "out"
        
        System.out.print("Type in a number to check if integer: ");

        boolean check = Parser.tryParseInt(sc.nextLine(), out); // hint C#
        
        /* typical way to control the input of data to prevent the user from
            entering the wrong type of data
         */
        
        while (!check) {
            System.out.print("Invalid! not an integer, try again: ");
            check = Parser.tryParseInt(sc.nextLine(), out); // hint C#
        }
        
        System.out.println("Congrats! you have entered the integer: " + out);

        /* the same procedure can be done with Double
            by using the method Parser.tryParseDouble
         */
        
        sc.close();
        System.out.println("Exiting ..");
    }
}
