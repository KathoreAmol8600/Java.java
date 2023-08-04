/////////////////////////////////////////////////
// DispleyFactoers
//  ex 10
// 1,2,,5,10  it is factor if 10   
//step 02
///////////////////////////////////////////////

    import java.util.*;
import java.io.*;
// print jai ganesh

class Program13
{
    public static void main(String Arg[])
    {
        int ino=0;
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the numbar:");
        ino=Sobj.nextInt();
        Displey obj = new Displey();
        obj.DispleyX(ino);
       
    }
}


class Displey
{
    public void DispleyX(int ino)
    {
   int icnt=10;
   System.out.println("the Factoer of the Numbar"+ino);
    for(icnt = 1;icnt<=(ino/2);icnt++)
    {
        if((ino%icnt)==0)
        {
            System.out.println(icnt);
        }
    
    }
    }
}
