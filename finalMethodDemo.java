class base
{
    public final void fun()
    {
        System.out.println("inside base :: fun");
    }
    public final void gun()
    {
        System.out.println("inside base :: gun");
    }
    public final void gun(int no)
    {
        System.out.println("inside base:: gun(int)");
    }
}


class derived extends base
{
    public void fun()
    {
        System.out.println(("Derived :: fun");
    }
}

class finalMethodDemo 
{
    public static void main(String arg[])
    {
        base ref = new derived();
        ref.fun();    
    }
}
