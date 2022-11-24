package in.ineuron.main;
//encapsulation(providing security to data members (the most important component))
class student{
//	int age;
//	String name;
//	String city;
	//the moment u make any variable private u can access anywhere within same class but not outside the class directly.
	//u will have to take help of getters and setters for accessing the variables directly 
	private int age;
	private String name;
	private String city;
	//for every data members there are methods (getters and setters ) binded to them 
	//for higher security .thus it is called data binding
	
	void setAge(int a) //these are called setters used to set a method 
	{
		age=a;
		
	}
	void setName(String n)//setters dont have any return type
	{
		name=n;
	}
	void setCity(String c)

	{
		city=c;
	}
	int getAge() //getters is used to get value 
	//it does not take any arguments .it only retruns
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
public class Nov8thEncapsualtion {
public static void main(String[] args){
	student s1=new student();
	//these variables of another class is accessible from outside of their class by creating  their object 
	//as these variables are not private .we make them private and use them by creating setters and getters
	//functions 
//	//Direct access outside the class is harmful
//	s1.age=-25;//direct access of the private members of another class will result in compile time error
//	s1.name="gaurav";
//	s1.city="gaya";
//	System.out.println(s1.age);
//	System.out.println(s1.name);
//	System.out.println(s1.city);
	
	s1.setAge(23);
	s1.setCity("gaya");
	s1.setName("gaurav");
	System.out.println(s1.getAge());
	System.out.println(s1.getName());
	System.out.println(s1.getCity());
}
	

}
