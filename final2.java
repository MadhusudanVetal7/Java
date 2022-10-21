import java.lang.*;

class Base
{
   public void fun()
   {
    System.out.println("Base fun");
   }
   public final void gun()
   {
    System.out.println("Base gun");
   }
}
class Derived extends Base
{
public void fun()                                   // Overriding
    {
        System.out.println("Derived fun");
    }
   /* public void gun()                               // Not Allowed
    {
        System.out.println("Derived gun");
    }*/
}
class final2
{
    public static void main(String arg[])
    {
        Derived dobj = new Derived();
        dobj.fun();     // Derived fun
        dobj.gun();     // Base fun
    }
}

