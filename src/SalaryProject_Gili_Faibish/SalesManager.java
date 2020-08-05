package SalaryProject_Gili_Faibish;

// Sales manager class- Salary project by Gili Faibish 
public class SalesManager extends Manager implements Sale  {
	
	// Variable definitions
    private float commis;
    private float kmult; 
    private float salary;
    private String name;
    
    // Default 
    public SalesManager(){
    	commis = 18;
    	salary=708;
    	kmult = 3;
    	name="G-Dragon";
    }
    
    // Format for custom
    public SalesManager(float sal ,float commisNew, float kmultNew, String newName) {
    	salary = sal;
    	name= newName;
    	commis = commisNew;
    	kmult = kmultNew;
    }
    
    // Calculate the salary according to this worker's position
    public float ComputeSalary() {
    	salary = salary* kmult  * (1+commis/100);
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

