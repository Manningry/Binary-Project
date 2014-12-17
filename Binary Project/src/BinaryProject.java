
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
System.out.println("\n\nPlease enter the correct answers about binary search tracing:\n");

int qs = 0;
int qsCorrect = 0;
int qsWrong = 0;
int passNumber = 0; 
int left = 0; 
int right = numberLine.size()-1;

while(left <= right)
	{
	
	System.out.println("What is the pass Number for this cycle?\n");
	qs++;
	passNumber++;
	if(userInput.nextInt()== passNumber)
	{
		System.out.println("You are correct!\n");
		qsCorrect++;
	}
	else
	{
		System.out.println("That is wrong.\n");
		qsWrong++;
	}
	
	System.out.println("What is the left index number for this cycle?\n");
	qs++;
	if(userInput.nextInt()== left)
	{
		System.out.println("You are correct!\n");
		qsCorrect++;
	}
	else
	{
		System.out.println("That is wrong.\n");
		qsWrong++;
	}
	
	System.out.println("What is the right index number for this cycle?\n");
	qs++;
	if(userInput.nextInt()== right)
	{
		System.out.println("You are correct!\n");
		qsCorrect++;
	}
	else
	{
		System.out.println("That is wrong.\n");
		qsWrong++;
	}
	
	
	
	int middle = (left+right)/2;
	
	System.out.println("What is the middle index for this cycle?\n");
	qs++;
	if(userInput.nextInt()== middle)
	{
		System.out.println("You are correct!\n");
		qsCorrect++;
	}
	else
	{
		System.out.println("That is wrong.\n");
		qsWrong++;
	}
	
	System.out.println("What is the numberLine[middle] value for this cycle?\n");
	qs++;
	if(userInput.nextInt()== numberLine.get(middle))
	{
		System.out.println("You are correct!\n");
		qsCorrect++;
	}
	else
	{
		System.out.println("That is wrong.\n");
		qsWrong++;
	}
	
	
	if(target < numberLine.get(middle))
		{
		right = middle -1;
		}
	if(target > numberLine.get(middle))
		{
		left = middle +1;
		}
	if(numberLine.get(middle)==target)
	{
		break;
	}
	
}
		
System.out.println("Out of " + qs + " questions answered, you got\n" + qsCorrect
		+ " question(s) correct and " + qsWrong + " question(s) wrong.");
System.out.println((double) qsCorrect/qs * 100 + "%");
}
}