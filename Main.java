/*
Accept on number from user if number is less than 10 then print
“Hello” otherwise print “Demo”.
*/


import java.lang.*;
import java.io.*;

class ArithmeticX
{
	void Display(int iNo)
	{
		if(iNo < 10)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("Demo");
		}
	}
}

class Main
{
	public static void main(String Arg[])
	{
		BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number");

		int iValue = 0;

		try
		{
			iValue = Integer.parseInt(bobj.readLine());
		}
		catch(Exception eobj)
		{}

		ArithmeticX aobj = new ArithmeticX();
		aobj.Display(iValue);
	}
}