package in.ineuron.main;

class Dog
{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	private String name;
	private int cost;
}


public class EncapsulationExampleDog {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.setName("Tyson");
		System.out.println(d.getName());
d.setCost(20000);
System.out.println(d.getCost());
	}

}
