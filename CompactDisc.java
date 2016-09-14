/**This program creates a list of songs for a CD by reading from a file*/
import java.io.*;
/* 
 * 11/05/2015
 */
public class CompactDisc
{
	public static void main(String [] args) throws IOException
	{
		FileReader file = new FileReader("Classics.txt");
		BufferedReader input = new BufferedReader(file);
		String title;
		String artist;
		
		String[] cd =  new String [6];
		//Declare an array of songs, called cd, of size 6
		
		for (int i = 0; i < cd.length; i++)
		{
			title = input.readLine();
			artist = input.readLine();
			cd[i] = title + "\n" + artist;
			// fill the array by creating a new song with 
			// the title and artist and storing it in the 
			// appropriate position in the array
		}
		
		System.out.println("Contents of Classics:");
		for (int i = 0; i < cd.length; i++)
		{
		    System.out.println(cd[i]);
		}
	}
}