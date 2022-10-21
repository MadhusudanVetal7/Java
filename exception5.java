import java.lang.*;
import java.util.*;

class exception4
{
    public static void main(String a[])
    {
        int Arr[]={10,20,30,40,50};
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the index");
        int index = sobj.nextInt();

        try
        {
            System.out.println("Element at that index is :"+Arr[index]);
            System.out.println("Inside try");
        }

        
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println(obj);
            System.out.println("Inside catch");
        }
        
        catch(Exception obj)
5
            System.out.println(obj);
            System.out.println("Inside catch");
        }
        finally
        {
            System.out.println("Inside finally");
            sobj.close();
        }
        System.out.println("End of application");
    }


}