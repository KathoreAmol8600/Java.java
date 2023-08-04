/////////////////////////////////////////////////
//  Displey numbar;
//1,2,3,4......n
// N for user defiend:
//Using loop ex for loop 
//using Update for nigetiv numbar:
///////////////////////////////////////////////

    import java.util.*;
import java.io.*;
// print jai ganesh

class Program1o
{
    public static void main(String Arg[])
    {
        int ino=0;
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enetr the numbar");
        ino=Sobj.nextInt();
       Displey obj = new Displey();
       obj.DispleyX(ino);
    }
}


class Displey
{
    public void DispleyX(int ino)
    {
         if(ino<0)
        {
           ino=-ino;
        }
    
        for(int i=1;i<=ino;i++)
        {
            System.out.println(i);
        }
    }
}
