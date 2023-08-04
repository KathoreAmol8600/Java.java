/////////////////////////////////////////////////
//  Displey numbar;
//1,2,3,4......n
//Using loop ex for loop 
// N for user defiend:
// out of main class that is use class
///////////////////////////////////////////////

    import java.util.*;
import java.io.*;
// print jai ganesh

class Program8
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
    
        for(int i=1;i<=ino;i++)
        {
            System.out.println(i);
        }
    }
}
