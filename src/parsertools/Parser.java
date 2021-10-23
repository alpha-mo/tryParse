package parsertools;

public class Parser {
    private int intNumber;
    private double doubleNumber;
    private static boolean isInt;

    public Parser(int number_int) {
        intNumber = number_int;
    }

    public Parser(double number_double) {
        doubleNumber = number_double;
    }

    public int getIntNumber() {
        return intNumber;
    }

    public double getDoubleNumber() {
        return doubleNumber;
    }

    @Override
    public String toString() {
        return isInt ? Integer.toString(intNumber) : Double.toString(doubleNumber);
    }

    public static boolean tryParseInt(String number, Ref<Parser> refOut){
        isInt = true; // this set the Override to return the int value
        /* check input - is invalid return false */
        if (number == null || number.isBlank() || number.isEmpty()) return false;
        if (refOut == null) return false;

        /* set the refrence to null in order to so the parsing and return the desired value format */
        refOut.setValue(null);
        int nmbrOut; // temp vaiable to try parsing

        // parsing
        try {
            nmbrOut = Integer.parseInt(number);
        }catch (NumberFormatException e){
            return false;
        }

        // set the value of the reference object - case: success
        refOut.setValue(new Parser(nmbrOut));
        return  true; //case: success
    }

    public static boolean tryParseDouble(String number, Ref<Parser>refOut){
        isInt = false; // this set the Override to return the int value
        /* check input - is invalid return false */
        if (number == null || number.isBlank() || number.isEmpty()) return false;
        if (refOut == null) return false;

        /* set the refrence to null in order to so the parsing and return the desired value format */
        refOut.setValue(null);
        double nmbrOut; // temp vaiable to try parsing

        // parsing
        try {
            nmbrOut = Double.parseDouble(number);
        }catch (NumberFormatException e){
            return false;
        }

        // set the value of the reference object - case: success
        refOut.setValue(new Parser(nmbrOut));
        return  true; //case: success
    }
}
