////////////////////////////////////////////
//Print String on user input numbar time
// 2
//jai ganesh
//jai ganesh
////////////////////////////////////////////

    import java.util.*;
import java.io.*;
// print jai ganesh

class Program3
{
    public static void main(String Arg[])
    {
        
        int ino;
        System.out.println("jai Ganesh......");
        System.out.println("Enetr the numbar:");
        Scanner Sobj = new Scanner(System.in);
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
            System.out.println("Jai Ganeh...");
        }
    }
}
