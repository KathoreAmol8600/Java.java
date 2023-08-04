/////////////////////////////////////////////////
// SUMFactoers
//  ex 10
// 1,2,,5, it is factor if 10   
//sum of f is 8
//using updetor
///////////////////////////////////////////////

    import java.util.*;
import java.io.*;
// print jai ganesh

class Program16
{
    public static void main(String Arg[])
    {
        int ino=0;
        int iret=0;
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the numbar:");
        ino=Sobj.nextInt();
        Displey obj = new Displey();
        iret=obj.SumFactor(ino);
        System.out.println("The sum of factoer is :"+iret);

    }
}


class Displey
{
    public int SumFactor(int iNo)
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
     return isum;
    }

}
