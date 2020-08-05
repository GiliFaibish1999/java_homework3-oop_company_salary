package SalaryProject_Gili_Faibish;

// Imports from the other classes 
import SalaryProject_Gili_Faibish.SalesEmployee;
import SalaryProject_Gili_Faibish.Employee;
import SalaryProject_Gili_Faibish.Manager;
import SalaryProject_Gili_Faibish.SalesManager;

// Main class- Salary project by Gili Faibish 
public class SalaryMain 
{
    public static void main(String[] args)
    {
    	
    	// Create and prints the name and salary of a default regular employee
    	Employee m01 = new Employee();
    	System.out.println(m01.getName() + " " + m01.ComputeSalary());
    	
    	// Create and prints the name and salary of a custom regular employee
    	Employee m1 = new Employee(150 , "Gili");
    	System.out.println(m1.getName() + " " + m1.ComputeSalary());
    	
    	// Create and prints the name and salary of a default manager
    	Manager m02 = new Manager();
    	System.out.println(m02.getName() + " " + m02.ComputeSalary());
    	
    	// Create and prints the name and salary of a custom manager
    	Manager m2 = new Manager(300, 3, "Gilush");
    	System.out.println(m2.getName() + " " + m2.ComputeSalary());
    	
    	// Create and prints the name and salary of a default sales employee
    	SalesEmployee m03 = new SalesEmployee();
    	System.out.println(m03.getName() + " " + m03.ComputeSalary());
    	
    	// Create and prints the name and salary of a custom sales employee
    	SalesEmployee m3 = new SalesEmployee(100, 10, "Gilgul");
    	System.out.println(m3.getName() + " " + m3.ComputeSalary());
    	
    	// Create and prints the name and salary of a default sales manager
    	SalesManager m04 = new SalesManager();
    	System.out.println(m04.getName() + " " + m04.ComputeSalary());
    	
    	// Create and prints the name and salary of a custom sales manager
    	SalesManager m4 = new SalesManager(100, 10, 2, "Gilinka");
    	System.out.println(m4.getName() + " " + m4.ComputeSalary());

   }
}
