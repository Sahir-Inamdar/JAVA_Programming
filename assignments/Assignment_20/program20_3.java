class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: checkPerfect
// Description: check number is a perfect Number
// Input: int
// Output : perfect or not
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void checkPerfect(int num)
 {
int iCnt=0;
int iSum=0;

    for(iCnt=1; iCnt<num; iCnt++)
    {
        if(num % iCnt == 0)
        {
            iSum= iSum + iCnt;
        }
    } 
        if(iSum ==  num)
        {
            System.out.println("perfect number");
        }
        else
        {
            System.out.println("not perfect number");
        }
    } 
}
class program20_3
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.checkPerfect(6);
 }
}