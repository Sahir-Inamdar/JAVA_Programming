class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: countDigits
// Description: Counts the number of Digits
// Input: int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void countDigits(int num)
 {
 int iCnt=0;
    int iDigit=0;
    while(num != 0)
    {
        iDigit= num % 10;
        iCnt++;
        num=num /10;

    }
    System.out.println(iCnt); 
    }
}
class program16_5
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.countDigits(7865);
 }
}