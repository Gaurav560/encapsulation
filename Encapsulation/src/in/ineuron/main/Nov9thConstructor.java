package in.ineuron.main;

class studentt{
	private String name;
	private String city;
	private int age;
	//i am writing one common setter for all the instance variables
	//like we can have one common setter for all variables 
	//we cannot have one common getter for all the variables
	//as getter has a return type and it returns only one type of data at
	//a particular amount of time .
//	public void setData(int age,String name,String city) 
//	{
//		this.age=age;
//		this.city=city;
//		this.name=name;
//	}
	
	
	// a better version of getData is Constructor
	//constructor does not have a return type
	public studentt(int age,String name,String city) 
	{
		this.age=age;
		this.city=city;
		this.name=name;
	}
//	public void setAge(int age) {
//		this.age=age;
//	}
//	public void setName(String name) {
//		this.name=name;
//	}
//	public void setCity(String city) {
//		this.city=city;
//	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
}
public class Nov9thConstructor {

	public static void main(String[] args) {
		studentt s1=new studentt(23,"gaurav","gaya");
		
		//CONSTRUCTOR
		//no need to explicitly call a constructor 
		//it is automatically called at the time of object creation 
		//u can also pass parameters for constructors at  the time of object creation 
		//constructor have no return type 
		//name should be same as that of the class
		//does not have return keyword
		//except all it works as a method
		
//s1.setData(23, "gaurav", "gaya");
		
System.out.println(s1.getAge());
System.out.println(s1.getName());
System.out.println(s1.getCity());
	}

}
