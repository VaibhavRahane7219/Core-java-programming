package W3Resource;

import java.util.Scanner;

public class B152 
{
	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Input First No:");
int a=sc.nextInt();
System.out.println("Input Second No:");
int b=sc.nextInt();
System.out.println("Before Swapping:a="+a+",b="+b);
int c;
c=a;
a=b;
b=c;
System.out.println("After Swapping:a="+a+",b="+b);
	}

}
