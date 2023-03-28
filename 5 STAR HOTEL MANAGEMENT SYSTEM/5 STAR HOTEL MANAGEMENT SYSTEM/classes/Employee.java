package classes;
import java.lang.*;

public class Employee
{
	private String fname;
	private String lname;
	private String empId;
	private String age;
	private String blood;
	private String mobile;
	private String address;
	private double salary;
	
	public void setFName(String fname)
	{
		this.fname=fname;
	}
	public void setLName(String lname)
	{
		this.lname=lname;
	}
	public void setEmpId(String empId)
	{
		this.empId=empId;
	}
	public void setAge(String age)
	{
		this.age=age;
	}
	public void setBlood(String blood)
	{
		this.blood=blood;
	}
	public void setMobile(String mobile)
	{
		this.mobile=mobile;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
		
	}
	public String getFName()
	{
		return fname;
	}
	public String getLName()
	{
		return lname;
	}
	public String getEmpId()
	{
		return empId;
	}
	public String getAge()
	{
		return age;
	}
	public String getBlood()
	{
		return blood;
	}
	public String getMobile()
	{
		return mobile;
	}
	public String getAddress()
	{
		return address;
	}
	public double getSalary()
	{
		return salary;
	}
	
	
	
}