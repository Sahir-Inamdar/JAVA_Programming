class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printEvenNumbers
// Description: prints even numbers till N
// Input: int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
void printEvenNumbers(int n)
{
int iCnt=0;

    for(iCnt=1; iCnt<=n; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            System.out.println(iCnt);
        }
    }
} 
}
class program18_2
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.printEvenNumbers(20);
 }
}
