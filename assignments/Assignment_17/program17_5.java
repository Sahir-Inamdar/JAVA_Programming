class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printTable
// Description: prints table of number
// Input: int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void printTable(int num)
 {
    int iCnt=0;
    int iTable=0;

    for(iCnt=1; iCnt<=10; iCnt++)
    {
        iTable = num * iCnt;
        System.out.println(iTable);
    }

 }
}
class program17_5
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.printTable(5);
 }
}