class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: findMin
// Description: checks minimum of 3 Number
// Input: int ,int ,int
// Output : int
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void findMin(int a, int b, int c)
 {
    if(a < b && a < c)
    {
        System.out.println("minimum is:"+a);
    }
    else if(b < a && b < c)
    {
        System.out.println("minimum is:"+b);
    }
    else
    {
        System.out.println("minimum is:"+c);
    }
 }
}
class program17_3
{
 public static void main(String args[])
 {
    Logic obj = new Logic();
    obj.findMin(3, 7, 2);
 }
}