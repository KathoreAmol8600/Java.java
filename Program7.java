/////////////////////////////////////////////////
//  Displey numbar;
//1,2,3,4......n
//Using loop ex for loop 
// out of main class that is use class
///////////////////////////////////////////////

    import java.util.*;
import java.io.*;
// print jai ganesh

class Program7
{
    public static void main(String Arg[])
    {
       Displey obj = new Displey();
       obj.DispleyX();
    }
}


class Displey
{
    public void DispleyX()
    {
    
        for(int i=1;i<=7;i++)
        {
            System.out.println(i);
        }
    }
}
