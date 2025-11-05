class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: countFactors
// Description: counts total number of Factors of number
// Input: int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 3/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void countFactors(int num)
 {
int iCnt = 0;
int iFact=0;
   
    for(iCnt = 1; iCnt<num; iCnt++)
    {
        if((num % iCnt) == 0 )
        {
            iFact++;
        }
    }  
    System.out.println(iFact);

    }
}
class program21_4
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.countFactors(20);
 }
}