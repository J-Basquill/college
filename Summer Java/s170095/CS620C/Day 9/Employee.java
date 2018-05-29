/**
	This is a version of the Employee class that has been designed 
	to represent and employee in a payment system.
	You should save and compile this class and then create an employee
	object in a separate class inside the main method. 
	In this example, the separate "controller" that uses this class is named
	PayRoll.java, which has a main method that creates three instances of the 
	Employee class and manipulates their data through the getter and setter methods.

	Joseph Duffin 6th September 2017

**/

public class Employee
{
	// only one copy of this variable is kept and this is incremenented each time
	// we use the Employee constructor.
	public static int numberOfEmployees=1; // keep count of the number of employee's created
	
    private int empNumber; // private Class variable, only methods inside the class can access this.
	private String workCategory;
	
    /**
     * Employee constructor : 
     *
     */
    public Employee() //Notice there is NO return type for a class constructor.
    {
        empNumber = numberOfEmployees; // set the class attribute (variable) 
		numberOfEmployees++;
		workCategory = "undefined";
    }
	/**
     * Employee constructor : 
     * @param category the cagetory of work done by the employee
     */
    public Employee(String category) //Notice there is NO return type for a class constructor.
    {
		workCategory = category; // set the type of work done by the employee
		
        empNumber = numberOfEmployees; // set the employee id number and
		numberOfEmployees++;           // advance the number of employees
    }
	
	
    /**
     * This provides the radius of the circle
     * @return the radius of the circle.
     */
    public int getEmployeeNumber(){ // getter method
        return empNumber; // return the value of the class attribute radius
    }
    /**
     * This sets the radius of the circle
     * @param num the new value for the radius of the circle.
     */
    public void setEmployeeNumber(int num){ // Setter method (to change the number)
        
        empNumber = num; // set the class attribute (variable) radius equal to num
    } 
	
	public String getWorkCategory(){
		
		return workCategory;
	}
	
	public void setWorkCategory(String category){
		
		workCategory = category;
		
	}
}