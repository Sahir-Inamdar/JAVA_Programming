class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findSmallestDigit
// Description: finds the Smallest Digit in the number
// Input: int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void findSmallestDigit(int num)
 {
    int iDigit=0;
    int iCompare= 0;
    iCompare=10;

    while(num != 0)
    {
        iDigit= num % 10;
        num=num /10;
        if(iDigit < iCompare )
        {
            iCompare = iDigit;
        }
    }
    System.out.println(iCompare+"is Smallest");
   } 
}
class program20_5
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.findSmallestDigit(45872);
 }
}