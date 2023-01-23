package JavaWithHarry;

public class CWH_Ch2_Operators 
{
	public static void main(String[] args) 
	{
//Arithmatic Operators
		int a=4;
		int b=6%a; //modulo operator
		int c=6*a; //Multiplication Operator
		int d=6-a; //Subtraction Operator
		System.out.println(b +"\n"+ c +"\n" +d);
		
//Assignment Operator
		int q=9;
		q *=3;
		System.out.println(q);
		
//Comparison Operator
		System.out.println(54>9);
		System.out.println(28<97);
		System.out.println(10==22);
		
//Logical Operator
		System.out.println(63>8 && 39<76);
		System.out.println(28<18 || 76<37);
		
//Bitwise Operator
		System.out.println(5&3);
		
	}

}
