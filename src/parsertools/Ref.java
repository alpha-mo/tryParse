package parsertools;

/***
 * this class will serve as a template for creating a reference object
 * regardless of the desired type of data.
 * 
 * @param <X> the type of data
 */
public class Ref<X> {

	private X value;
	
	public Ref() {}

	public X getValue() {
		return value;
	}

	public void setValue(X value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value == null ? "object is null" : value.toString();
	}
}
