class Logic
{
///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findFactorial
// Description: find factorial of number
// Input: int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void findFactorial(int num)
 {
    int iCnt=0;
    int ifact=1;
   for(iCnt=1;iCnt<=num;iCnt++)
   {
    ifact = ifact * iCnt;
   }
 System.out.println(ifact);
 }
 
 
}
class program16_2
{
 public static void main(String args[])
 {
 Logic obj = new Logic();
 obj.findFactorial(5);
 }
}