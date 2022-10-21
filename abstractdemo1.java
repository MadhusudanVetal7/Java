import java.lang.*;

abstract class Demo
{
    public int i,j;

    public Demo()
    {
        System.out.println("Demo constructor");

    }
    public void fun()       // Concrete
    {
        System.out.println("Demo fun");

    }
    public abstract void gun();             // Abstact

}
class Hello extends Demo
{
    public int x,y;
    public Hello()
    {
        System.out.println("Hello constructor");
    }
    public void sun()
    {
        System.out.println("Hello sun");
    }
    public void gun()
    {
        System.out.println("Hello gun");
    }
}

class abstractdemo1
{
    public static void main(String arg[])
    {

        Hello hobj = new Hello();
        hobj.fun();
        hobj.gun();
        hobj.sun();
    }
}



