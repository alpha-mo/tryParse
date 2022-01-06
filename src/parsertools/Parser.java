package parsertools;

public class Parser {
	
	// you can obviously replicate the proccess for other types like Long ...
	/*
	 * a little note here:
	 * when trying to parse the input from the user the methods here will
	 * set the out-reference variable value to null in case of failior
	 * this is set to prevent confusion
	 * if you wish to keep any previously set value then you can just
	 * set the out value in the case of success instead, like this:
	 * if ( parsed != null ) refOut.setValue(parsed);
	 */
	
    public static <T> boolean tryParseInt(T inputNumber, Ref<Integer> refOut){
        
    	if ( isNothing(inputNumber) == false ) return false; // check if input is not null or empty
        
        Integer parsed = intParser(inputNumber); // try to parse
        refOut.setValue(parsed); // set the value of the out-reference variable
        
        return  parsed == null ? false : true;
    }
    
    public static <T> boolean tryParseDouble(T inputNumber, Ref<Double> refOut){
    	
    	if ( isNothing(inputNumber) == false ) return false; // check if input is not null or empty
    	
    	Double parsed = doubleParser(inputNumber);  // try to parse
    	refOut.setValue(parsed); // set the value of the out-reference variable
    	
    	return  parsed == null ? false : true;
    }
    
    private static<T> Boolean isNothing(T input) {
    	if ( input == null 				|| 
    		 input.toString().isBlank() || 
    		 input.toString().isEmpty() || 
    		 input == null) return false;
    	else return true;
	}

    private static <T> Integer intParser(T input) {
    	
    	try {
    		return Integer.parseInt((String) input); // if success
    	}catch (NumberFormatException e){
    		return null; // if failior
    	}
    	
    }
    
    private static <T> Double doubleParser(T input) {
    	
    	try {
    		return Double.parseDouble((String) input); // if success
    	}catch (NumberFormatException e){
    		return null; // if failior
    	}
    	
    }
}

















