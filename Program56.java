
//CheckDigit is present in numbar:

import java.util.Scanner;
public class Program56 {
    public static void main(String Arg[])
    {
        System.out.println("Enter the numbar :");
        Scanner Sobj=new Scanner(System.in);
        int ino=Sobj.nextInt();
        System.out.println("Enter the num for :");
        int isearch = Sobj.nextInt();
        int idigeat=0;
        boolean bret=false;
        for(;ino!=0;ino=ino/10)
        {
         idigeat=ino%10;
          if(idigeat==isearch)
            {
               bret=true;
               break;
            }
        }
        if(bret==true)
        {
            System.out.println("the numbar are  present in numbar:");
        }else{
           System.out.println("the numbar are not present in numbar:");

        }
    Sobj.close();
    }
}
