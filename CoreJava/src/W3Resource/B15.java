package W3Resource;

import java.util.Scanner;

public class B15 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Firs No:");
		int a=sc.nextInt();
		System.out.println("Input Second No:");
        int b=sc.nextInt();
        System.out.println("Two Inputs Are:a="+a+",b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapping Of Two No is:a="+a+",b="+b);
	}

}
