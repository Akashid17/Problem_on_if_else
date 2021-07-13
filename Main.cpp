/*
Accept on number from user if number is less than 10 then print
“Hello” otherwise print “Demo”.
*/


using namespace std;

#include<iostream>

class ArithmeticX
{
public:
	
	void Display(int iNo)
	{
		if(iNo < 10)
		{
			cout<<"Hello\n";
		}
		else
		{
			cout<<"Demo\n";
		}
	}
};

int main()
{
	int iValue = 0;

	cout<<"Enter Number\n";
	cin>>iValue;

	ArithmeticX aobj;
	aobj.Display(iValue);

	return 0;
}