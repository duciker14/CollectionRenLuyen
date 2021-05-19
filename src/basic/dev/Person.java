package basic.dev;

public class Person implements Comparable<Person> {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	@Override
//	public int compareTo(Person a) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(a.getName());
//	}
	
	@Override
	public int compareTo(Person a) {
		// TODO Auto-generated method stub
		if (this.age > a.getAge()) {
			return -1;	
		}else if (this.age == a.getAge()) {
			return 0;
		} else {
			return 1;
		}
	}
	
}
