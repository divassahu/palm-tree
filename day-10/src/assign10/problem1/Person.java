 package assign10.problem1;

import java.util.Objects;

public class Person {
	@Override
	public int hashCode() {
		return Objects.hash(address, gender, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && Objects.equals(gender, other.gender)
				&& Objects.equals(name, other.name);
	}
	public String name;
	public String gender;
	public Address address;
}
