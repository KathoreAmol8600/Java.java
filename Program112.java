// Input :  5
// Output : -5  -4  -3  -2  -1  0   1   2   3   4   5   
import java.util.*;
public class Program112 {
    public static void main(String Arg[])
    {
        Scanner Sobj = new Scanner(System.in);
        int ino = Sobj.nextInt();
        for(int i=1;i<=ino;i++)
        {
            System.out.print(" "+i);
        }
        for(int i=0;i>=(-ino);i--)
        {
            System.out.print(" "+i);
        }
        
    }    
}
