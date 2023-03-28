import java.io.*;
import java.util.Scanner;

class MyFileIo
{
	public static void main(String [] args)throws Exception
	{
		///Input functions
		Scanner scan          = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr    = new BufferedReader(isr);
		
		///variables for FileInput
		String s ="",temp;
		char choice = 'y';
		File file = new File ("Input.txt");///Creating a new File
		file.createNewFile();
		
		///Writing in to file............................
		FileWriter writer = new FileWriter(file);
     
		///Conditions for continuing writing in file
		System.out.println("Input your sentence!");
        while(choice == 'y')
		{
			temp = bfr.readLine();///The java.io.BufferedReader.readline() method read a line of text.
			
			s=s+temp+"\r\n";///??????
			System.out.println("More press y and n for no");
			choice=scan.next().charAt(0);
			
		}	

        		
		 ///writing into file
		 writer.write(s);///???
		 writer.flush();
		 writer.close();
	     
		 ///Reading from file...............................
		 FileReader reader  = new FileReader(file);
		 BufferedReader bfl = new BufferedReader(reader);
		 
		 ///variables for file reading
		 
		 String a= "";
		 
		 ///variables for different condition in file 
		 
		 ///variables for file reading 
			
			int vowel=0;
			int consonent=0;
			int space=0;
			int sentence=0;
			int total=0;
			int line=0;
			int word=0;
			
			while((temp=bfl.readLine())!=null)
			{
				a=a+temp+"\r\n";
				///conditions for vowel consonent space 
				for(int i=0;i<temp.length();i++)
				{
					if(temp.charAt(i)=='a'||temp.charAt(i)=='e'||temp.charAt(i)=='i'||temp.charAt(i)=='o'||temp.charAt(i)=='u')
					{
						vowel++;
					}
					else if (temp.charAt(i)==' ')
					{
						space++;
			            word ++;

					}
					else if(temp.charAt(i)=='.')
					{
						sentence ++;
						
					}
		  			
					else
					{
						consonent++;
					}
					
									
				}
				
                 word=word + 1;
				///counting alphabet
				total=vowel+consonent;
				///counting lines
				
                line=line+1;
				
		    }	
		 	
			
			    System.out.print(a);
			
			    System.out.println("Number of Alphabets  : "+total);
			    System.out.println("Number of Vowels     : "+vowel);
				System.out.println("Number of Consonents : "+consonent);
				System.out.println("Number of Spaces     : "+space);
				System.out.println("Number of Sentences  : "+sentence);
				System.out.println("Number of Words      : "+word);
				System.out.println("Number of Lines      : "+line);

				
			reader.close();
			
			
		/// writiing into new file called output
		

			
		File file2 = new File ("output.txt");///Creating a new File
		
       FileOutputStream fos = new FileOutputStream(file2);
       PrintStream ps = new PrintStream(fos);
       System.setOut(ps);
       			System.out.println("Number of Alphabets  : "+total);
			    System.out.println("Number of Vowels     : "+vowel);
				System.out.println("Number of Consonents : "+consonent);
				System.out.println("Number of Spaces     : "+space);
				System.out.println("Number of Sentences  : "+sentence);
				System.out.println("Number of Words      : "+word);
				System.out.println("Number of Lines      : "+line);



	}
}
   