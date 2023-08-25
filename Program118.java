/*
    Input : 

    Row : 3
    Col : 5

    Output : 
    a   b   c   d   e
    a   b   c   d   e
    a   b   c   d   e        
*/ 
import java.util.Scanner;


class Program118
{
    public static void main(String Arg[])
    {
        Scanner Sobj =new Scanner(System.in);
        System.out.println("Row");
        int no1=Sobj.nextInt();
        System.out.println("cpl");
        int no2=Sobj.nextInt();

        for(int i=1;i<=no1;i++)
        {
            char C='a';
            for(int j=1;j<=no2;j++)
            {
                System.out.print(C+"\t");
                C++;
            }
            System.out.println();

        }


    }
}