/////////////////////////////////////////////////
// SUMFactoers
//  ex 10
// 1,2,,5, it is factor if 10   
//sum of f is 8
///////////////////////////////////////////////

    import java.util.*;
import java.io.*;
// print jai ganesh

class Program15
{
    public static void main(String Arg[])
    {
        int ino=0;
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the numbar:");
        ino=Sobj.nextInt();
        Displey obj = new Displey();
        obj.SumFactor(ino);
       
    }
}


class Displey
{
    public void SumFactor(int ino)
    {
   int icnt=10;
   int isum =0;
//    System.out.println("the Factoer of the Numbar"+ino);
    for(icnt = 1;icnt<=(ino/2);icnt++)
    {
        if((ino%icnt)==0)
        {
            isum = isum+icnt;
        }
    
    }
    
    System.out.println("The sum of factoer is :"+isum);
    }
}
