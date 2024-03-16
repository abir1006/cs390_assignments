package prob1;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Key key = (Key) o;
		return firstName.equals(key.firstName) && lastName.equals(key.lastName);
	}

	public int hashCode() {
		int result = 17;
		int hashFirst = firstName.hashCode();
		int hashSecond = lastName.hashCode();
		result += 31 * result + hashFirst;
		result += 31 * result + hashSecond;
		return result;
	}
}
