import java.lang.*;







class Base
{
    public int i;
    public int j;

    public void fun()
    {
        System.out.println("Inside Base fun");
    }
}
class Derived extends Base  //class Derived : public Base
{
    public int x;
    public int y;

    public void gun()
    {
        System.out.println("Inside derived gun");
    }
}

class DerivedX extends Derived
{
    public int a;

    public void sun()
    {
        System.out.println("Inside DerivedX sun");
    }
}

class inheritance4
{

    public static void main(String a[])
    {
        System.out.println("Inside main");
        DerivedX dobj = new DerivedX();

        dobj.gun();

    }
}
