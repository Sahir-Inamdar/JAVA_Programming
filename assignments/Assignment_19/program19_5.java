class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printDigits
// Description:  calculates the power of a number using loop
// Input: int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void calculatePower(int base, int exp)
 {
    int iCnt=0;
    int iAns=1;
    
    for(iCnt=1; iCnt<=exp; iCnt++)
    {
        iAns = iAns * base;
    }
     System.out.println(iAns);
 }
}
class program19_5
{
 public static void main(String args[])
 {
 Logic obj = new Logic();
 obj.calculatePower(2, 5);
 }
}