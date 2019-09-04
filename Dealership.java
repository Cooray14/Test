package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle car = new Vehicle();
		
		car.setMake("Ford");
		car.setModel("F150");
		car.setYear(2019);
		car.setPrice(40000);
		
		Customer cust1 = new Customer();
		
		cust1.setName("Tom");
		cust1.setAddress("1234 street st");
		cust1.setCashOnHand(40001);
		cust1.setCreditScore(500);
		
		Employee emp = new Employee();
		
		emp.setName("Dale");
		emp.setEmployeeNumber(123);
		
		
		cust1.purchaseCar(car, emp, false);
		
	}

}
