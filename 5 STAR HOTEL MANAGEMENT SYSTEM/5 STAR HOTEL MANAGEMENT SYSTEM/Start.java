import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start
{   
    private int choice;
	private int option1;
	private int option2;
	//private int option3;
	//private int option4;
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Business b = new Business();
		Hotel h = new Hotel();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
	    Start s=new Start(); 
	    
		System.out.println("*****---Welcome to our Hotel  Management Application---****");
	
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("        **--What do you want to do?--**\n");
			System.out.println("	            1. About Employee");
			System.out.println("	            2. About Guest");
			//System.out.println("	            3. Shop Product Management");
			//System.out.println("	            4. Product Quantity Add-Sell");
			System.out.println("	            5. Exit\n");
       try
	   {
			System.out.print("Your Choice: ");
			s.choice = sc.nextInt();
		}		
				
				
		catch(InputMismatchException ime)
		{
			System.out.println("Input Mismatch Exception Occured please run again and give valid input");
		     break;
		}
		
			switch(s.choice)   
			{
				case 1:
				
					System.out.println("--------------------------------");
					System.out.println("You have chosen Employee Management");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("	1. Insert New Employee");
					System.out.println("	2. Removing Existing Employee");
					System.out.println("	3. Show All Employees");
					System.out.println("	4. Search an Employee");
					System.out.println("	5. Go Back\n");
					
			try
	             {
			             System.out.print("Your Option: ");
			             s.option1 = sc.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception Occurred please run again and give valid input");
		     break;
		}	
					switch(s.option1)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee First Name: ");//add
							String fname1 = sc.next();//add
							System.out.print("Enter Employee Last Name: ");//add
							String lname1 = sc.next();//add
							System.out.print("Enter Employee Age: ");
							String age1 = sc.next();
							System.out.print("Enter Employee's Blood group: ");//add
							String blood1 = sc.next();//add
							System.out.print("Enter Employee's Phone Number : ");//add
							String mobile1 = sc.next();//add
							System.out.print("Enter Employee's Address : ");//add
							String address1 = sc.next();//add
							System.out.print("Enter Employee's E-mail Address : ");//add
							String email1 = sc.next();//add
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setFName(fname1);//add
							e1.setLName(lname1);//add
							e1.setAge(age1);
							e1.setBlood(blood1);//add
							e1.setMobile(mobile1);//add
							e1.setAddress(address1);//add
						
							e1.setSalary(salary1);
							
							b.insertEmployee(e1);
							
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
							break;
							
						case 2:
						
							System.out.println("************************");
							System.out.println("Remove an Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = b.getEmployee(empId2);
							
							if(e2 != null)
							{
								b.removeEmployee(e2);
							}
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All Employees");
							b.showAllEmployees();
							System.out.println("########################");
							break;
						
						case 4:
						
							System.out.println("########################");
							System.out.println("Search an Employee");
							                                                               //  ctrl+s
							System.out.print("Enter Employee ID: ");
							String empId4 = sc.next();
							
							Employee e4 = b.getEmployee(empId4);
							
							if(e4 !=null)
							{
								System.out.println();
								System.out.println("Employee ID : "+e4.getEmpId());
								System.out.println("Employee Name : "+e4.getFName()+" "+e4.getLName());//add
								System.out.println("Employee Age : "+e4.getAge()+" "+"years");
								System.out.println("Employee's Blood group : "+e4.getBlood()+"Ve");//add
								System.out.println("Employee Phone Number : +88"+e4.getMobile());//add
								System.out.println("Employee's Address : "+e4.getAddress());//add
								System.out.println("Employee Salary : "+e4.getSalary()+""+"/=");
								System.out.println();
							}
							
							System.out.println("########################");
							break;
					case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
							
					}
					System.out.println("--------------------------------");
					break;
					
							


					case 2:
				
					System.out.println("--------------------------------");
					System.out.println("You have chosen Employee Management");
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("	1. Insert New Guest");
					System.out.println("	2. Removing Existing Guest");
					System.out.println("	3. Show All Guests");
					System.out.println("	4. Search A Guest");
					System.out.println("	5. Go Back\n");
					
			try
	             {
			             System.out.print("Your Option: ");
			             s.option2 = sc.nextInt();
	              }		
				
				
		catch(InputMismatchException ine)
		{
			System.out.println("Input Mismatch Exception Occurred please run again and give valid input");
		     break;
		}	
					switch(s.option2)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Guest");
							
							System.out.print("Enter Guest ID: ");
							String gId1 = sc.next();
							System.out.print("Enter Guest's First Name: ");//add
							String gFName1 = sc.next();//add
							System.out.print("Enter Guest's Last Name: ");//add
							String gLName1 = sc.next();//add
							System.out.print("Enter Type Of Room : ");//add
							String gTRoom1 = sc.next();//add
							System.out.print("Enter Number Of Room : ");//add
							int gNRoom1 = sc.nextInt();//add
							System.out.print("Enter date of DateIN : ");//add
							String gDateIn1 = sc.next();//add
							System.out.print("Enter date of DateOut : ");//add
							String gDateOut1 = sc.next();//add
							System.out.print("Enter Rate of Room : ");//add
							float gRate1 = sc.nextFloat();//add
							System.out.print("Enter Payment Type  : ");//add
							String gPayment1 = sc.next();//add
							System.out.print("Enter Discount : ");//add
							float gDiscount1 = sc.nextFloat();//add
							System.out.print("Bill : ");//add
							float gTotalBill1 = sc.nextFloat();//add
							
							
							
		
							
							Guest g1 = new Guest();
							g1.setGId(gId1);
							g1.setGFName(gFName1);
							g1.setGLName(gLName1);
							g1.setGTRoom(gTRoom1);
							g1.setGNRoom(gNRoom1);
							g1.setGDateIn(gDateIn1);
							g1.setGDateOut(gDateOut1);
							g1.setGRate(gRate1);
							g1.setGPayment(gPayment1);
							g1.setGDiscount(gDiscount1);
							g1.setGTotalBill(gTotalBill1);
							
							h.insertGuest(g1);
							
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
							break;
							
						case 2:
						
							System.out.println("************************");
							System.out.println("Remove an Existing Guest");
							
							System.out.print("Enter Guest ID: ");
							String gId2 = sc.next();
							
							Guest g2 = h.getGuest(gId2);
							
							if(g2 != null)
							{
								h.removeGuest(g2);
							}
							System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All Guests");
							h.showAllGuests();
							System.out.println("########################");
							break;
						
						case 4:
						
							System.out.println("########################");
							System.out.println("Search A Guest");
							                                                               //  ctrl+s
							System.out.print("Enter Guest ID: ");
							String gId4 = sc.next();
							
							Guest g4 = h.getGuest(gId4);
							
							if(g4 !=null)
							{
								System.out.println();
								System.out.println("Guest ID : "+g4.getGId());
								System.out.println("Guest Name : "+g4.getGFName()+" "+g4.getGLName());//add
								System.out.println("Type Of Room : "+g4.getGTRoom());
								System.out.println("Number Of Room : "+g4.getGNRoom());
								System.out.println("Date Of Entry : "+g4.getGDateIn());
								System.out.println("Date Of TakeOver : "+g4.getGDateOut());
								System.out.println("Rate Of Room : "+g4.getGRate());
								System.out.println("Payment Type: "+g4.getGPayment());
								System.out.println("Discount : "+g4.getGDiscount());
								System.out.println("Total Bill : "+g4.getGTotalBill());
								
								
								System.out.println();
							}
							
							System.out.println("########################");
							break;
						

					case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					System.out.println("--------------------------------");
					break;
					
					
				case 5:
				
					System.out.println("--------------------------------");
					System.out.println("You have chosen to Exit");
					repeat = false;
					System.out.println("--------------------------------");
					break;
					
				default:
				
					System.out.println("--------------------------------");
					System.out.println("Invalid Choice");
					System.out.println("--------------------------------");
					break;
			}
		}
	}
}