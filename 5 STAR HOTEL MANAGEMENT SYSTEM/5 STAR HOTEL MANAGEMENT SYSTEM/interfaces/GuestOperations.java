package interfaces;

import java.lang.*;
import classes.*;

public interface GuestOperations
{
	void insertGuest(Guest g);
	void removeGuest(Guest g);
	
	void showAllGuests();
	
}