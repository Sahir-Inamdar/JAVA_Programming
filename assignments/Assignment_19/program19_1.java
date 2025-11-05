class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkLeapYear
// Description:  Checks whether year is leap or not
// Input: int
// Output : leap or not
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void checkLeapYear(int year)
 {
 if(year % 4 == 0)
 {
    System.out.println("it is a leap year");
 }
    else
    {
        System.out.println("it is a not leap year");
    }
 }
 
}
class program19_1
{
 public static void main(String args[])
 {
 Logic obj = new Logic();
 obj.checkLeapYear(2024);
 }
}