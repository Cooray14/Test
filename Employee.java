package car_dealership;

public class Employee {
	
	private String name;
	private int employeeNumber;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		
		if(finance){
			runCreditHistory(cust, vehicle.getPrice() - cust.getCashOnHand(), vehicle);
		} else if(cust.getCashOnHand() > vehicle.getPrice()){
		  	processTransaction(cust, vehicle);
		} else {
			System.out.println("Bring more money");
		}
	}

	public void runCreditHistory(Customer cust, double doubleAmount, Vehicle vehicle) {
		
		if(cust.getCreditScore() <  600) {
			System.out.println("Application Denied");
		} else {
			processTransaction(cust, vehicle);
		}
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {;
			
		System.out.println(cust.getName() + " Purchased " + vehicle.getYear() + " " + vehicle.getMake() + " " + vehicle.getModel());
		System.out.println("From " + this.name + " Employee Number: " + this.employeeNumber );
		System.out.println("Transaction Processed");
	
	}
}
