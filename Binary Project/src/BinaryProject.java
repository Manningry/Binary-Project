
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinaryProject
	{
	static Scanner userInput = new Scanner(System.in);
	static ArrayList <Integer> numberLine = new ArrayList<Integer>();
	
	public static void main(String[] args)
		{
		createNumLine();
		testProgram();
		}
	
	
	public static void createNumLine()
	{
		System.out.println("Welcome to the binary sorter.\n");
		System.out.println("First we need to make a list of numbers! Input as many numbers (1-20) as you would like, one at a time, pressing "
				+ "\nenter after each number. Please enter '-1' when you're finished!\n");
		
		while(true)
			{ 
				
				int nextNumber = userInput.nextInt();
				if(nextNumber >-1 && nextNumber <21)
				{
					numberLine.add(nextNumber);
				}
				if(nextNumber <-1 || nextNumber > 20)
				{
					System.out.println("Please try again.");
				}
					
				if(nextNumber == -1)
				{
					break;
				}
			}
	System.out.println(" ");
	Collections.sort(numberLine);
	for(int i = 0; i < numberLine.size(); i++)
	{
	System.out.print(numberLine.get(i) + " ");
	}
				
			}
			
	
public static void testProgram()
{
int randomNum = (int) Math.random()* numberLine.size();

System.out.println("\n\nYou are binary searching the following number:" + numberLine.get(randomNum));
System.out.println("\n\nPlease enter correct answers to the following questions about binary search tracing:");
System.out.println("\n\nPass#   Left   Right   Middle   numberLine[middle]");	
	
	
}
			
				
}