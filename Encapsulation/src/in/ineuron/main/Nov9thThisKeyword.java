package in.ineuron.main;

class student2{
	private int age;
	private String name;
	private String city;
	public void setAge(int age) {
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;//use of this keyword to remove the problem of shadowing 
	}
	public void setCity(String city) {
		this.city=city;//this keyword points to the current object which is in execution by jvm
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
public class Nov9thThisKeyword {

	public static void main(String[] args) {
		//we can create many objects inside a class
		
student2 s1=new student2();//1st object creation under class student2
s1.setAge(23);
System.out.println(s1.getAge());


student2 s2=new student2();//2nd object creation under class student2
s2.setAge(11);
System.out.println(s2.getAge());
	}

}
//no matter how many times we create the object,every time instance variable memory will be allocated in heap 
//always remember the execution of program takes place in stack and allocation of memory takes place in heap