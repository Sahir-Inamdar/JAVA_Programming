class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findMax
// Description: checks maximum of 2 Number
// Input: int,int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void findMax(int a, int b)
 {
    if(a > b)
    {
        System.out.println("maximum is:"+a);
    }
    else
    {
        System.out.println("maximum is:"+b);
    }
     }
}
class program17_4
{
 public static void main(String args[])
 {
 Logic obj = new Logic();
 obj.findMax(20, 15);
 }
}