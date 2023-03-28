package classes;
import java.lang.*;
import interfaces.*;

public class Hotel implements GuestOperations
{
   
   private Guest guests[]=new Guest[100];


    
    public void insertGuest(Guest g)
	{
		int flag = 0;
		for(int i=0; i<guests.length; i++)
		{
			if(guests[i] == null)
			{
				guests[i] = g;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Guest Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
	
	
	public void removeGuest(Guest g)
	{
		int flag = 0;
		for(int i=0; i<guests.length; i++)
		{
			if(guests[i] == g)
			{
				guests[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Guest Removed");
	    }
		else
		{
			System.out.println("Can Not Remove");
		}
	}
	public void showAllGuests()
	{
		System.out.println("*/////////////////////////////////*");
		for(Guest g : guests)
		{
			if(g != null)
			{
				System.out.println("Guest's First Name: "+ g.getGFName());
				System.out.println("Guest's Last Name: "+ g.getGLName());
				System.out.println("Guest ID: "+ g.getGId());
					System.out.println("Type Of Room : "+g.getGTRoom());
								System.out.println("Number Of Room : "+g.getGNRoom());
								System.out.println("Date Of Entry : "+g.getGDateIn());
			System.out.println("Date Of TakeOver : "+g.getGDateOut());
			System.out.println("Rate Of Room : "+g.getGRate());
				
				System.out.println();
			}
		}
		System.out.println("*//////////////////////////////////*");
	}
	public Guest getGuest(String gId)
	{
		Guest g = null;
		
		for(int i=0; i<guests.length; i++)
		{                                                      
			if(guests[i] != null)
			{
				if(guests[i].getGId().equals(gId))
				{
					g = guests[i];
					break;
				}
			}
		}
		if(g != null)
		{
			System.out.println("Guest Found");
		}
		else
		{
			System.out.println("Guest Not Found");
		}
		return g;
	}
	
}   
