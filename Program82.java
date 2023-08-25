import java.util.Scanner;

public class Program82 {
    public static void main(String Arg[])
    {
        int ino=0;
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the numbar:");
        ino=Sobj.nextInt();

        int [] Aobj= new int[ino];
        for(int i=0;i<ino;i++)
        {
           Aobj[i]=Sobj.nextInt();
        }
        for(int i=0;i<ino;i++)
        {
           System.out.println(Aobj[i]);
        }
    }
}
