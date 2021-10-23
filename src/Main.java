import parsertools.Parser;
import parsertools.Ref;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* example on how to use the parser and passing by reference in java
            this example will simulate the tryParse method in C#
         */
        Scanner scanner = new Scanner(System.in);
        Ref<Parser> out = new Ref<>(); // create instance of ref object "out"
        System.out.print("Type in a number to check if integer: ");

        boolean check = Parser.tryParseInt(scanner.nextLine(), out); // hint C#
        /* typical way to control the input of data to prevent the use from
            entering the wrong type of data
         */
        while (!check) {
            System.out.print("invalid! not and integer, try again: ");
            check = Parser.tryParseInt(scanner.nextLine(), out); // hint C#
        }
        System.out.println("Congrats! you have entered the integer: " + out);

        /* the same procedure can be done with Double
            by using the method Parser.tryParseDouble
         */
    }
}
