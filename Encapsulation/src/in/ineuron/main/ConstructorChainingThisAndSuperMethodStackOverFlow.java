package in.ineuron.main;
class Student5{
	//constructor chaining as in many constructors there are this ()
//method which calls the constructor in the same class according to their parameters
	private int age;
	private String name;
	private String city;
	public Student5()//default constructor
	{
		
		this("shweta");
		age=24;
		city="Ranchi"; 
	}
	public Student5(int age,String city,String name)//parameterized constructor
	{
	//	this(18,"Gaya","Gaurav"); ->>It is a case of 
		// AND STACK OVERFLOW AS THIS METHOD
		//WILL OCNTINUOSLY CALL THE CONSTRUCTOR ITSELF
		super();//koi fark nahi padta isko likho ya na likho 
		this.age=age;
		this.name=name;
		this.city=city;
	}
	public Student5(String name) 
	{
		super();
		this.name=name;
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
public class ConstructorChainingThisAndSuperMethodStackOverFlow 
{

	public static void main(String[] args) {
		
			{
				Student5 s1=new Student5(18,"gaya","gaurav");
				
				System.out.println(s1.getAge());
				System.out.println(s1.getName());
				System.out.println(s1.getCity());
				
				Student5 s2=new Student5();
				System.out.println(s2.getAge());
				System.out.println(s2.getName());
				System.out.println(s2.getCity());
				
				
			}

		}

	}


