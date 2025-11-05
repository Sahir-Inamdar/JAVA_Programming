class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkDivisible
// Description:  Checks whether Number is Divisible by 5 and 11 
// Input: int
// Output : Divisible or not
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void checkDivisible(int num)
 {
 if((num % 5) == 0 && (num % 11) == 0)
 {
    System.out.println("it is Divisible by 5 and 11");
 }
 else
 {
    System.out.println("it is not Divisible by 5 and 11");
 }
 }
}
class program19_3
{
 public static void main(String args[])
 {
 Logic obj = new Logic();
 obj.checkDivisible(55);
 }
}