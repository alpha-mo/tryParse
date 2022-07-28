package parsertools;

public class Parser {
	/**
	 * @param userInput the data to be parsed
	 * @param refOut the out variable that will get a value after trying to parse
	 * @return true: success, false: failure
	 * @param <T> the data type provided by user
	 */
    public static <T> boolean tryParseInt(T userInput, Ref<Integer> refOut){

		// check if input is not null or empty
    	if ( isNothing(userInput) ) {
			refOut.setValue(null);
			return false;
		}
        
        Integer parsed = intParser(userInput); // try to parse
        refOut.setValue(parsed); // set the value of the out-reference variable
        
        return parsed != null;
    }

	/**
	 * @param userInput the data to be parsed
	 * @param refOut the out variable that will get a value after trying to parse
	 * @return true: success, false: failure
	 * @param <T> the data type provided by user
	 */
    public static <T> boolean tryParseDouble(T userInput, Ref<Double> refOut){

		// check if input is not null or empty
		if ( isNothing(userInput) ) {
			refOut.setValue(null);
			return false;
		}

		Double parsed = doubleParser(userInput); // try to parse
		refOut.setValue(parsed); // set the value of the out-reference variable

		return parsed != null;
    }

	/**
	 * utility method to check if input has data
	 * @param input user input value to check
	 * @param <T> the data type provided by user
	 * @return true: if user provides nothing, false: if user provides some data
	 */
    private static<T> Boolean isNothing(T input) {
		return input == null || input.toString().isBlank() || input.toString().isEmpty();
	}

	/**
	 * utility method that trys to parse user input to integer
	 * @param input the data to be parsed
	 * @return Integer: success, null: failure
	 * @param <T> the data type provided
	 */
    private static <T> Integer intParser(T input) {
    	
    	try {
    		return Integer.parseInt((String) input); // if success
    	}catch (NumberFormatException e){
    		return null; // if failior
    	}
    	
    }

	/**
	 * utility method that trys to parse user input to double
	 * @param input the data to be parsed
	 * @return Integer: success, null: failure
	 * @param <T> the data type provided
	 */
    private static <T> Double doubleParser(T input) {
    	
    	try {
    		return Double.parseDouble((String) input); // if success
    	}catch (NumberFormatException e){
    		return null; // if failior
    	}
    	
    }
}