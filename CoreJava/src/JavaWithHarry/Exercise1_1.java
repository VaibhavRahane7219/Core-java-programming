package JavaWithHarry;

import java.util.Scanner;

public class Exercise1_1 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("Entger Student Name");
String s=sc.nextLine();
System.out.println("Enter Student Class");
int a=sc.nextInt();
System.out.println("Enter Student Marks");
System.out.println("English:");
int b=sc.nextInt();
System.out.println("Physics:");
int c=sc.nextInt();
System.out.println("Chemistry:");
int d=sc.nextInt();
System.out.println("Math:");
int e=sc.nextInt();
System.out.println("IT:");
int f=sc.nextInt();
float total=(b+c+d+e+f);
float Avg=total/5;
System.out.println("Name:"+s);
System.out.println("Std:"+a);
System.out.println("Subject"+"   --->"+"Marks");
System.out.println("English"+"   --->"+b+"/100");
System.out.println("Physics"+"   --->"+c+"/100");
System.out.println("Chemistry"+" --->"+d+"/100");
System.out.println("Math"+"      --->"+e+"/100");
System.out.println("IT"+"        --->"+f+"/100");
System.out.println("Total"+"     --->"+total+"/500");
System.out.println("Percentage"+"--->"+Avg+"/100");
	}
}
