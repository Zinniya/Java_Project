import java.io.*;
import java.util.Scanner;
public class FileInputOutput 
{
	public static void main(String args[])throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		String s="", temp; 
		char choice = 'y';
		File file = new File("Hello1.txt");
		  
		
		file.createNewFile();
		  
		
		FileWriter writer = new FileWriter(file); 
		  
		
		while(choice=='y')
		{
			temp = bfr.readLine();
			s=s+temp+"\r\n";
			System.out.println("More? y for yes and n for no");
			choice=sc.next().charAt(0); 
		}
		writer.write(s); 
		writer.flush();
		writer.close();

		
		FileReader reader = new FileReader(file);
		BufferedReader bfl = new BufferedReader(reader);
		
		String a="";
		while((temp=bfl.readLine())!=null)
		{
			a=a+temp+"\r\n";
		}
		
		System.out.print(a);   
		reader.close();
	}
}