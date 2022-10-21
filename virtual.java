import java.lang.*;

class Base
{
    public int i,j;

    public void fun()                       //defination
    {   System.out.println("Base fun");}
    public void gun()                       //defination
    {   System.out.println("Base gun");}
    public void sun()                       //defination
    {   System.out.println("Base sun");}

}

class Derived extends Base
{
    public int x,y;
    public void fun()                       // ovrriding
    {   System.out.println("Derived fun");}
    public void sun()                       //overriding
    {   System.out.println("Derived sun");}
    public void run()                       //defination
    {   System.out.println("Derived run");}

}
class virtual
{

    public static void main(String arg[])
    {
//        Base bobj = new Base();                 //no casting
//        Derived dobj = new Derived();           //no casting

        Base obj = new Derived();              //upcasting
//        Derived obj2 = new Base();             //Downcasting

        obj.fun();
        obj.gun();
//        obj.run();
        obj.sun();

    }

}
