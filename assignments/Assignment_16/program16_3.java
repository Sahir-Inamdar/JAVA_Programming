class Logic
{
///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkEvenOdd
// Description: checks NO is Even or odd
// Input: int
// Output : even or odd
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void checkEvenOdd(int num)
 {
if(num % 2 == 0)
{
    System.out.println("even Number");
}
else
{
    System.out.println("Odd Number");
}
 }
}
class program16_3
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.checkEvenOdd(7);
 }
}