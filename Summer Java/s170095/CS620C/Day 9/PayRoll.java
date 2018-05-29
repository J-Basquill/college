/**
	This PayRoll class is a controller class that create Employee objects
	and manipulates the data in these objects through the getter and setter
	methods.
	Joseph Duffin 6th of September 2017
**/
public class PayRoll {

	public static void main (String []args){
	
		// create a new employee
		Employee empRef = new Employee();
		
		// the line below will retrieve the employee number
		// by calling the getEmployeeNumber method on the empRef object (employee)
		int value = empRef.getEmployeeNumber();
		
		System.out.println("The current number of the employee is " + value);
		
		// create a second employee
		Employee empRef2 = new Employee();
		// get the employee number of this employee
		value = empRef2.getEmployeeNumber();
		
		System.out.println("The current number of the employee is " + value);
		
		// create a third employee
		Employee empRef3 = new Employee("Clerical worker");
		// get the employee number of this employee
		value = empRef3.getEmployeeNumber();
		// find out the work category for this employee
		String catg = empRef3.getWorkCategory();
		
		System.out.println("Employee number " + value + " works in the following category " + catg);
	
	} // end of main


} // end of program