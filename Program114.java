import java.util.Scanner;

class Program114
{
    public static void main(String Arg[])
    {
        Scanner Sobj =new Scanner(System.in);
        int irow =Sobj.nextInt();
        // Scanner Sobj =new Scanner(System.in);
        int icol =Sobj.nextInt();
        for(int i=1;i<=irow;i++)
        {
            
        for(int j=0;j<=(icol);j++)
        {
            System.out.print(i);
        }
        System.out.println();
        }
    }
}