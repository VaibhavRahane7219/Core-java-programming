package W3Resource;

import java.util.Scanner;

public class B7 
{
	public static void main(String[] args)
	{
int n,i;
Scanner sc=new Scanner (System.in);
System.out.println("Input The Number:");
n=sc.nextInt();
for(i=1;i<=10;i++)
{
	System.out.println(n+"*"+i+"="+(n*i));
}
	}

}
