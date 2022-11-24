package in.ineuron.main;
class Student4{
	private int age;
	private String name;
	private String city;
	public Student4()//default constructor
	{
		super();//->automatic call to super method in every constructor
		
		//this super method will call its parent class constructor(having same parameters)
		//by default super method will call parent class zero parameter constructor
		//it is included by java compiler behind the scene
		//by default there will be super method but if u want to replace super method 
		//with this() method u can do that .but remember only one will be present in a constructor
		//and that also on 1st line in body of constructor.
		//to use this () method u have to call it explicitly and write in the space of super()method
		//note:this() method calls the constructor of the same class()
		//->>based on parameters this and super method decides which constructor to call
		name="Gaurav";
		age=23;
		city="Gaya"; 
	}
	public Student4(int age,String city,String name)//parameterized constructor
	{
		this.age=age;
		this.name=name;
		this.city=city;
	}
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

public class Nov9thConstructorOverloading
//this is an example of constructor overloading
{
	

	public static void main(String[] args)
	{
		Student4 s1=new Student4(18,"gaya","gaurav");
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		System.out.println(s1.getCity());
		Student4 s2=new Student4();
		System.out.println(s2.getAge());
		System.out.println(s2.getName());
		System.out.println(s2.getCity());
		
		
	}

}
