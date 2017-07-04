package AssignmenDemo;

public class Car extends Vehicle {

	public static void main(String[] args) {
		Car cr= new Car();
		cr.Drive();

	}

	@Override
	void Drive() {
		 System.out.println("Best Car");
		
	}

}
