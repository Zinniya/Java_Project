package classes;
import java.lang.*;
import interfaces.*;

public class Business implements EmployeeOperations
{
 
   private Employee employees[]=new Employee[100];


    
    public void insertEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("EMPLOYEE HAS INSERTED");
		}
		else
		{
			System.out.println("CAN NOT INSERT");
		}
	}
	
	
	public void removeEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("***EMPLOYEE REMOVED***");
	    }
		else
		{
			System.out.println("***CAN NOT REMOVE***");
		}
	}
	public void showAllEmployees()
	{
		System.out.println("***************************************");
		for(Employee e : employees)
		{
			if(e != null)
			{
				System.out.println("Employee First Name: "+ e.getFName());
				System.out.println("Employee Last Name: "+ e.getLName());
				System.out.println("Employee ID: "+ e.getEmpId());
				System.out.println("Employee Address: "+ e.getAddress());
				
				System.out.println();
			}
		}
		System.out.println("****************************************");
	}
	public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		if(e != null)
		{
			System.out.println("***EMPLOYEE FOUND***");
		}
		else
		{
			System.out.println("EMPLOYEE NOT FOUND, TRY TO INSERT CORRECT DETAILS ABOUT EMPLOYEE***");
		}
		return e;
	}
	
}   