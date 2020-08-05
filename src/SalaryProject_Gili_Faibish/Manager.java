package SalaryProject_Gili_Faibish;

// Manager class- Salary project by Gili Faibish 
public class Manager extends Employee {
	
	// Variable definitions
    private float kmult; 
    private float salary;
    private String name;
    
    // Default 
    public Manager() {
    	kmult =2;
    	salary= 500;
    	name = "Taeyang";
    }
    
    // Format for custom
    public Manager(float sal ,float kmultNew, String newName) {
    	salary = sal;
    	name= newName;
    	kmult = kmultNew;
    }
    
    // Calculate the salary according to this worker's position
    public float ComputeSalary() {
    	salary = salary * kmult;
    	return salary;
    }
    
    // Returns this worker's name
    public String getName() { 
    	return name;
	}
}

