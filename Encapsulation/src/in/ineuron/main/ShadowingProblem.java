package in.ineuron.main;

class gaur{
	private int age;
	private String name;
	private String city;

	void setAge(int age) //these are called setters used to set a method 
	{
//		age=age;
		this.age=age;
		
	}
	void setName(String name)
	{
//		name=name;
		this.name=name;
		//jvm will confuse where what to give when name of local and instance variable is same within a setter
		//shadowing-whenever there is name conflict between instance variable an local variable within a setter
		//then this shadowing problem occurs.in this compiler return the default data value of the the datatype
	}
	void setCity(String city)

	{
//		city=city;
		this.city=city;
	}
	int getAge() 
	{
		return age;
	}
	String getCity() {
		return city;
	}
	String getName() {
		return name;
	}
	
	
}
public class ShadowingProblem {

	public static void main(String[] args) {
		gaur s1=new gaur();
		
		s1.setAge(23);
		s1.setCity("gaya");
		s1.setName("gaurav");
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		System.out.println(s1.getCity());
	}
	}
//output-age=0(default value of an integer )
//name=null(default value of a string)
//city=null(default value of a string)
//this  shadowing problem is solved by this keyword

