package classes;
import java.lang.*;

public class Guest
{
	private String gFName;
	private String gLName;
	private String gId;
	private String gTRoom;//add
	private int gNRoom;//add
	private String gDateIn;
	private String gDateOut;//add
	private float gRate;
	private String gPayment;//add
	private float gDiscount;//add
	private float gTotalBill;
	
	public void setGFName(String gFName)//add
	{//add
		this.gFName=gFName;//add
	}//add
	public void setGLName(String gLName)//add
	{//add
		this.gLName=gLName;//add
	}//add
	public void setGId(String gId)//add
	{//add
		this.gId=gId;//add
	}//add
	public void setGTRoom(String gTRoom)//add
   {
		this.gTRoom=gTRoom;//add
	}//add
	public void setGNRoom(int gNRoom)//add
	{//add
		this.gNRoom=gNRoom;//add
	}//add
	public void setGDateIn(String gDateIn)
  {
		this.gDateIn=gDateIn;
	}
public void setGDateOut(String gDateOut)
  {
		this.gDateOut=gDateOut;
	}
	public void setGRate(float gRate)//add
	{//add
		this.gRate=gRate;//add
	}//add
	public void setGPayment(String gPayment)//add
	{//add
		this.gPayment=gPayment;//add
	}//add
	public void setGDiscount(float gDiscount)//add
	{//add
		this.gDiscount=gDiscount;//add
	}//add
	public void setGTotalBill(float gTotalBill)//add
	{//add
		this.gTotalBill=gTotalBill;//add
	}//add
	
	public String getGFName()
	{
		return gFName;
	}
	public String getGLName()
	{
		return gLName;
	}
	public String getGId()//add
	{
		return gId;
	}
	public String getGTRoom()//add
	{//add
		return gTRoom;//add
	}//add
	public int getGNRoom()//add
	{//add
		return gNRoom;//add
	}//add
	public String getGDateIn()
	{
		return gDateIn;
	}
	public String getGDateOut()
	{
		return gDateOut;
	}
	
	public float getGRate()
	{
		return gRate;
	}
	
	public String getGPayment()//add
	{//add
		return gPayment;//add
	}//add
	public float getGDiscount()//add
	{//add
		return gDiscount;//add
	}//add
	public float getGTotalBill()//add
{//add
		return gTotalBill=gRate*gDiscount;//add
	}//add
	
}