import java.util.Scanner; 
public class Task1_RandomNo 
{ 
	public static void main(String[] args) 
  { 
	int num; 
	Scanner scan = new Scanner(System.in);
	guess(); 
	System.out.println("Guess a number between 1 and 100."); 
	num = scan.nextInt();
	if (num >= 1 && num <= 100)
	{
		while (checkNumber(num) != true) 
		{
			System.out.println("Guess again");
			num = scan.nextInt(); 
			checkNumber(num);
		} 
	} 
	else 
	{
		System.out.print("Number is not between 1 to 100");
	}	
  } 
  public static int guess() 
  { 
	  return ((int) (1 + Math.random()*100)); 
  }
  public static boolean checkNumber(int a)
  { 
	  int ans = guess(); 
	  if (a < ans) 
	  {
		  System.out.println("low"); 
		  return false; 
	  } 
	  else if (a > ans) 
	  { 
		  System.out.println("high"); 
		  return false;
	  } 
	  else return true;
  }
  
}
