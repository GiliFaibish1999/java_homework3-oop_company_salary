package SalaryProject_Gili_Faibish;
import SalaryProject_Gili_Faibish.Employee;

// Sales employee class- Salary project by Gili Faibish 
public class SalesEmployee extends Employee implements Sale {
	
	// Variable definitions
	private float commis;
	private float salary;
	private String name;
	
	// Default 
    public SalesEmployee() {
    	commis = 15;
    	salary=64;
    	name = "Daesung";
    }
    
    // Format for custom
    public SalesEmployee(float sal ,float commisNew, String newName) {
    	salary = sal;
    	name= newName;
    	commis = commisNew;
    }
    
    // Calculate the salary according to this worker's position
    public float ComputeSalary() {
    	salary = salary * (1+commis/100);
    	return salary;
    }

    // Returns this worker's name
    public String getName() { 
    	return name;
	}
    
    // Implemented Sale methods
	@Override
	public float getCom() {
		return commis;
	}
	@Override
	public String getSaleName() {
		return name;
	}
}

