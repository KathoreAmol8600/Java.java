
// check numbare are divisibal by 3 and 5 are not :
import java.util.Scanner;
class Program7
{
    public static void main(String Arg[])
    {  
        boolean bret=true;
        Scanner Sobj = new Scanner(System.in);
        int ino=Sobj.nextInt();
        Check obj1 = new Check();
        bret = obj1.checknum(ino);
        Sobj.close();
        if(bret==true)
        {
            System.out.println("the numbar are Divisibal by 3 and 5");
        }else if(bret==false)
        {
          System.out.println("the numbar are not  Divisibal by 3 and 5");
        }
    }
}

class Check
{
    public boolean checknum(int no1)       // boolean is data type 
    {
        if(((no1%3)==0)&&((no1%5)==0))
        {
            return true;
        }else 
        {
           return false;

        }
       
    }
}
