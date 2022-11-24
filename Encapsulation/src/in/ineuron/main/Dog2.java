package in.ineuron.main;

class dog{
	//bean as all the instance members are private
	private String name;
	private int cost;
	
	public void setName(String name) {
		this.name=name;
		
	}
	public void setCost(int cost) {
		this.cost=cost;
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	
}
public class Dog2 {

	public static void main(String[] args) {
		// creating an example of encapsulation 
dog d1=new dog();
d1.setCost(20000);
d1.setName("Tyson");
 System.out.println(d1.getName());
 System.out.println(d1.getCost());
	}

}
