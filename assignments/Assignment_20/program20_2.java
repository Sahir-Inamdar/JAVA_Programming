class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printReverse
// Description: print numbers from N down to 1 in reverse order
// Input: int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void printReverse(int n)
 {
int iCnt=0;

    for(iCnt=n; iCnt>=1; iCnt--)
    {
        
        System.out.println(iCnt);
        
    } 
    }
}
class program20_2
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.printReverse(10);
 }
}