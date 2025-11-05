class Logic
{
//////////////////////////////////////////////////////////////////////////////////
//
// Function Name: displayGrade
// Description:  isplay grades as per marks 
// Input: int
// Output : A,B,c,D or fail
// Author : Sahir Saiduddin Inamdar
// Date : 2/11/25
//
///////////////////////////////////////////////////////////////////////////////////
 void displayGrade(int marks)
 {
 if(marks > 85 && marks <=100)
 {
    System.out.println("Grade A");
 }
 else if(marks > 75 && marks <=85)
 {
    System.out.println("Grade B");
 }
 else if(marks >= 65 && marks <=75)
 {
    System.out.println("Grade C");
 }
 else if(marks >= 35 && marks <65 )
 {
    System.out.println("Grade D");
 }
 else if(marks < 35)
 {
    System.out.println("Fail");
 }
 else
 {
    System.out.println("Invaild marks");
 }

 }
}
class program19_2
{
 public static void main(String args[])
 {
 Logic obj = new Logic();
 obj.displayGrade(82);
 }
}