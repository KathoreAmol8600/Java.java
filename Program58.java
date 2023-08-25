import java.util.Scanner;

public class Program58 {
    public static void main(String arg[])
    {
      Scanner Sobj = new Scanner(System.in);
      System.out.println("Enter the numbar ");
      int ino = Sobj.nextInt();
      System.out.println("Enter frequemsey of numbar that want you search ");
      int ino1 = Sobj.nextInt();
      int iDge=0;
      int count=0;
      while(ino!=0)
      {
        iDge=ino%10;
        if(iDge==ino1)
        {
            count++;
        }
        ino=ino/10;
      }
      System.out.println(("The frquensey are :"+count));

    }
}
