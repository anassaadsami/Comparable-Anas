package comparable;

public class Members implements Comparable<Members>{
	String name ;
	int age;
	
	public Members(String name, int age) {
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
	@Override
	public String toString() {
		return "Members [name=" + name + ", age=" + age + "]";
	}
	// if we want to compare the objects by age we use this method
//	@Override
//	public int compareTo(Members m) {
//		int i = this.age - m.age ;     // sort the objects from small to big
////		int i = m.age - this.age ;     // sort the objects from big to small
//		return i;
//	}
	// by me to compare objects by name we use this method
	@Override
	public int compareTo(Members m) {
//		int x = this.name.compareTo(m.name) ;   // sort the names  alfabet   this method in this line is String method 
//		int x = m.name.compareTo(this.name) ;    // sort the names opposite alfabet
		int x = this.age - m.age;
		return x;
	}
	



	}
