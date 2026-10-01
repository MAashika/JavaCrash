package Constructor;
//Overloading==>Same Constructors But with Diffrent Parameters(No Arguement+Parameterization)

public class Overloading {
	String AnimalName="Zebra";
	String BirdName;
	
	public Overloading() {
		System.out.println("Name of Animal:" + AnimalName);
	}
	public Overloading(String Name) {
		BirdName=Name;
		System.out.println("Name of Bird :" + BirdName);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj=new Overloading();
		Overloading obj1=new Overloading("Parrot");

	}

}
