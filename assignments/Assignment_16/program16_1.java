class Logic
{
///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: calculateSum
// Description: calculates the sum of first N natural numbers
// Input: int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void calculateSum(int n)
 {
    int iCnt=0;
    int iSum=0;

    for(iCnt = 1; iCnt<=n; iCnt++)
    {
       iSum = iSum + iCnt;
       
    }
    System.out.println(iSum);
    
 }
}
class program16_1
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.calculateSum(10);
 }
}