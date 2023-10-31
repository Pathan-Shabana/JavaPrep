package exceptionHanldingConcept;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingExample {
	public static void main(String[] args)
	{
		readTheTextFile("C:\\Users\\zoy\\eclipse-workspace\\JavaPrep\\src\\sampleFolder\\sample");
	}
	public static void readTheTextFile(String filepath)
	{
	    String line;
		
		try(java.io.BufferedReader br= new java.io.BufferedReader(new java.io.FileReader(filepath))) {
			
			while((line=br.readLine())!=null)
					{
				System.out.println(line);
					}
			
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("The File that you are looking for has not been found");
		}
		catch(IOException io)
		{
			System.out.println("There is an Input Output Exception");
		}
//		finally {
//			br.close();
//		}
	}

}
