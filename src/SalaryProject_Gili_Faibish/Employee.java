package SalaryProject_Gili_Faibish;

// Employee class- Salary project by Gili Faibish 
public class Employee {
	
	// Variable definitions
    private float salary;
    private String name;

    // Default 
    public Employee() {
    	name = "T.O.P";
        salary = 30;
    }
    
    // Format for custom
    public Employee(float sal, String newName) {
    	name=newName;
    	salary = sal;
    }
   
    // Calculate the salary according to this worker's position
    public float ComputeSalary()    {
    	return salary;
    }
    
    // Returns this worker's name
    public String getName() {    	
    	return name; 
	}     
}
