class Logic
{
///////////////////////////////////////////////////////////////////////////////////
//
// Function Name: reverseNumber
// Description: reverse the number
// Input: int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void reverseNumber(int num)
 {
    
    int iDigit=0;
    int irev= 0;
    while(num != 0)
    {
        iDigit= num % 10;
        irev = (irev * 10) + iDigit;
        num=num /10;
        System.out.println(irev)
    }
 }
}
class program16_4
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.reverseNumber(1234);
 }
}