/////////////////////////////////////////////////
// SUMFactoers
//  ex 10
// 1,2,,5, it is factor if 10   
//sum of f is 8
//using updetor
//Check perfect its or not the sum of factoer numbar
//equal to num
///////////////////////////////////////////////

    import java.util.*;
import java.io.*;
// print jai ganesh

class Program18
{
    public static void main(String Arg[])
    {
        int ino=0;
        int ino1=0;
        int iret=0;
        boolean bret=true;
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the numbar:");
        ino=Sobj.nextInt();

        // System.out.println("Enetr the numbar for checking:");
        // ino1=Sobj.nextInt();

        Displey obj = new Displey();
        bret=obj.CheckPerfect(ino);

        System.out.println("The sum of factoer is :"+iret);
        if(bret==true)
        {
            System.out.println("nubar is perfect num" );
        }
        else{
            System.out.println("Numbar is not perfect numbar:");
        }
    }
}


class Displey
{
    public boolean CheckPerfect(int iNo)
    {
   int icnt=10;
   int isum =0;
//    System.out.println("the Factoer of the Numbar"+ino);
    for(icnt = 1;icnt<=(iNo/2);icnt++)
    {
        if(iNo < 0)     // Updator
    {
        iNo = -iNo;
    }
        if((iNo%icnt)==0)
        {
            isum = isum+icnt;
        }
    
    }
    if(isum==iNo)
    {
        return true;
    }else{
        return false;
    }
     
    }

}


