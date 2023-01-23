package InterviewPractice;

public class NumberPattern
{
	public static void main(String[] args)
	{
   for(int i=1; i<=5; i++)
   {
	   for(int j=1; j<=i; j++)
	   {
		   if(i==2 || i==5 || i==3)
		   {
			   System.out.print(i);
		   }
		   else
		   {
			   System.out.print(j);
		   }
	   }
		   System.out.println(" ");
   }
	}

}
