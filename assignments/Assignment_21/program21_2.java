class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: countEvenOddRange
// Description: counts how many even and odd numbers are present between 1 and N
// Input: int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void countEvenOddRange(int n)
 {
    int iCnt=0;
    int iEven=0;
    int iOdd=0;

    for(iCnt=1; iCnt<=n; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            iEven++;
        }
        if(iCnt % 2 != 0)
        {
            iOdd++;
        }
    } 

    System.out.println(iEven+"Even Numbers");
    System.out.println(iOdd+"Odd Numbers");
    
    }
}
class program21_2
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.countEvenOddRange(50);
 }
}