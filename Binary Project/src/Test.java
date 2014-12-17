import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Test
	{
	static int numCorrect=0;
	static int numQuestion=0;
	
	public static int quizzer()
		{
		Scanner filler = new Scanner(System.in);
		System.out.println("Enter a list of numbers between 1 and 20. Enter -1 when you wish to stop.");
		ArrayList elements = new ArrayList();
		
		do
			{
			int a = filler.nextInt();
			if((a>=1&&a<=20))
				{
				elements.add((int)a);
				}
			else if(a==-1)
				{
				break;
				}
			else
				{
				System.out.println("That is not valid. Enter another number.");
				}
			
			}
		while(true);
		
		Collections.sort(elements);
		
		for(Object x : elements)
			{
			System.out.print(x+" ");
			}
		System.out.println("");
		
		int ran = (int)(Math.random()*(elements.size()));
		int target = (int) elements.get(ran);
		System.out.println("The target is "+target+".");
		
		int pass = 1;
		int choice;
		int left = 0;
		int right = (int)elements.size()-1;
		while (left <= right)
			{
			System.out.println("What pass number is this?");
			choice = filler.nextInt();
			if(choice==pass)
				{
					System.out.println("Correct!");
					numQuestion+=1;
					numCorrect+=1;
				}
			else
				{
				System.out.println("Incorrect!");
				numQuestion+=1;
				}
			
			System.out.println("What is the farthest left index in the search?");
			choice = filler.nextInt();
			if(choice==left)
				{
					System.out.println("Correct!");
					numQuestion+=1;
					numCorrect+=1;
				}
			else
				{
				System.out.println("Incorrect!");
				numQuestion+=1;
				}
			
			System.out.println("What is the farthest right index in the search?");
			choice = filler.nextInt();
			if(choice==right)
				{
					System.out.println("Correct!");
					numQuestion+=1;
					numCorrect+=1;
				}
			else
				{
				System.out.println("Incorrect!");
				numQuestion+=1;
				}
			
			int middle = (left + right) / 2;
			
			System.out.println("What is the middle index in the search?");
			choice = filler.nextInt();
			if(choice==middle)
				{
					System.out.println("Correct!");
					numQuestion+=1;
					numCorrect+=1;
				}
			else
				{
				System.out.println("Incorrect!");
				numQuestion+=1;
				}
			
			System.out.println("What is the value of the middle index in the search?");
			choice = filler.nextInt();
			if(choice==(int)elements.get(middle))
				{
					System.out.println("Correct!");
					numQuestion+=1;
					numCorrect+=1;
				}
			else
				{
				System.out.println("Incorrect!");
				numQuestion+=1;
				}
			
			if (target < (int)elements.get(middle))
				{
				right = middle-1;
				}
			else if (target > (int)elements.get(middle))
				{
				left = middle + 1;
				}
			else
				{
				return middle;
				}
			pass+=1;
			}
		
		return -1;
		
		}


	public static void main(String[] args)
		{
		quizzer();
		System.out.println("Your score is "+(((double)numCorrect/(double)numQuestion)*100));
		}

	}