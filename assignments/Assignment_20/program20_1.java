class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: sumEvenNumbers
// Description: prints sum of even numbers till N
// Input: int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void sumEvenNumbers(int n)
 {
int iCnt=0;
int iSum=0;

    for(iCnt=1; iCnt<=n; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            iSum= iSum + iCnt;
            
        }
    } 
    System.out.println(iSum);
    }
}
class program20_1
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.sumEvenNumbers(10);
 }
}