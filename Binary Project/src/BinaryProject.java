
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinaryProject
	{
	
	static ArrayList <Integer> numberLine = new ArrayList<Integer>();
	static boolean notNegativeOne = true;
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
		{
		createNumLine();
		testProgram();
		}
	
	
	public static void createNumLine()
	{
		System.out.println("Welcome to the binary sorter.\n");
		System.out.println("Input as many numbers (1-20) as you would like, one at a time, pressing "
				+ "\nenter after each number. Please enter '-1' when you're finished!\n");
		
		
		while(notNegativeOne)
			{ 
				
				int nextNumber = userInput.nextInt();
				
				
//				if(!userInput.hasNextInt())
//					{
//					System.out.println("Please try again.");
//					boolean num = new Scanner(System.in).hasNextInt();
//					}
				if(nextNumber >-1 && nextNumber <21 && nextNumber > 0)
				{
					numberLine.add(nextNumber);
				}
				if(nextNumber <-1 || nextNumber > 20 || nextNumber == 0)
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
int randomNum = (int) (Math.random()* numberLine.size());
int target = numberLine.get(randomNum);

System.out.println("\n\nYour target number is:  " + target);
System.out.println("\n\nPlease enter correct answers to the following questions about binary search tracing:");
System.out.println("\n\nPass#   Left   Right   Middle   numberLine[middle]");	


int left = 0; 
int right = numberLine.size()-1;

while(left < right)
	{
	int middle = (left+right)/2;
	if(target < numberLine.get(middle))
		{
		right = middle -1;
		}
	if(target > numberLine.get(middle))
		{
		left = middle +1;
		}
	}



	
	
}
			
				
}