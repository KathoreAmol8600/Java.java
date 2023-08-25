import java.util.Scanner;

public class Program53 {
    public static void main(String Arg[])
    {
        Scanner Sobbj = new Scanner(System.in);
        int ino=Sobbj.nextInt();
        int idigeat=0;
        System.out.println("Numbar are:");

        for(;ino!=0;ino=ino/10)
        {
            idigeat=ino%10;
            System.out.println(idigeat);
        }
    }
}
