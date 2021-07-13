/*
Accept on number from user if number is less than 10 then print
“Hello” otherwise print “Demo”.
*/

using System;

class ArithmeticX
{
	public
	void Display(int iNo)
	{
		if(iNo < 10)
		{
			Console.WriteLine("Hello");
		}
		else
		{
			Console.WriteLine("Demo");
		}
	}
}

class main
{
	public static void Main(string[] Args)
	{
		Console.WriteLine("Enter Number");
		int iValue = Convert.ToInt32(Console.ReadLine());

		ArithmeticX aobj = new ArithmeticX();
		aobj.Display(iValue);
	}
}