'''
Accept on number from user if number is less than 10 then print
“Hello” otherwise print “Demo”.
'''

def Display(iNo):
    if iNo < 10:
        print("Hello")
    else:
        print("Demo")


iValue = int(input("Enter Number\n"))

Display(iValue)