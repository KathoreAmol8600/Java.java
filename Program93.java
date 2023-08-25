//  SearchLastOccurance

import java.util.Scanner;

public class Program93 {
    public static void main(String Arg[])
    {
    Scanner Sobj = new Scanner(System.in);
    System.out.println("Enter the Numbar of Isize :");
    int iSize = Sobj.nextInt();
    System.out.println("Enter tthe Numbar:");
    int[] Aarr=new int[iSize];
    for(int i=0;i<iSize;i++)
    {
      Aarr[i]= Sobj.nextInt();
    }
    System.out.println("Enter the numbar want you Search:");
    int iSearch = Sobj.nextInt();
    int iAns=iSize-1;
    for(int i=(iSize-1);i>=0;i--)
    {
      if(Aarr[i]==iSearch)
      {
        break;
      }
      iAns--;
    }
    System.out.println("the LastRefranse is:"+iAns);
    }
}
