
public class Person {
	private String firstName;
	private String lastName;
	
	public void setFirst(String f) { firstName = f; }
	public String getFirst() { return firstName; }
	public void setLast(String l) { lastName = l; }
	public String getLat() { return lastName; }
	public Person (String f, String l) {
		setFirst(f);
		setLast(l);
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
