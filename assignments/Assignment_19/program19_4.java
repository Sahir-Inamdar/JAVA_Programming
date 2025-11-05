class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: printDigits
// Description:  Prints the digits Seperately 
// Input: int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void printDigits(int num)
 {
 int iDigit=0;
    int irev= 0;
    while(num != 0)
    {
        iDigit= num % 10;
        irev = (irev * 10) + iDigit;
        num=num /10;
    }
    while(irev != 0)
    {
        iDigit= irev % 10;
        System.out.println(iDigit);
        irev=irev /10;
        
    }

}
}
class program19_4
{
 public static void main(String args[])
 {
 Logic obj = new Logic();
 obj.printDigits(9876);
 }
}