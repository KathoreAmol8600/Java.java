
/*
    Input : 

    Row : 6
    Col : 6

    Output : 
    A
    A   B
    A   B   C
    A   B   C   D
    A   B   C   D   E
    A   B   C   D   E   F             
*/ 
import java.util.Scanner;
public class Program140 {
    public static void main(String Arg[])
    {
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter the Row:");
        int irow=Sobj.nextInt();
        System.out.println("Enter the col:");
        int icol=Sobj.nextInt();
        for(int i=1;i<=irow;i++)
        {
            char ic='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+ic);ic++;
            }
            System.out.println("");
        }
        Sobj.close();
    }
}
