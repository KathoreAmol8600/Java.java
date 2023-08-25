
// Input :  5
// Output : 1   2   3   4   5   4   3   2   1   

import java.util.Scanner;

public class Program108 {
    public static void main(String Arg[])
    {
        System.out.println("Eter the numbar :");
        Scanner Sobj = new Scanner(System.in);
        int ino1=Sobj.nextInt();
        Displey Dobj = new Displey();
        Dobj.DispleyX(ino1);
        Sobj.close();

    }
}
class Displey
{
    
    public void DispleyX(int ino)
    {
        for(int i=1;i<ino;i++)
        {
            System.out.print(" "+i);
        }
        for(int i=ino;i>0;i--)
        {
            System.out.print(" "+i);
        }
    }
}
