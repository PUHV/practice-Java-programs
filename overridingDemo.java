class base
{
    public void fun()
    {
        System.out.println("Inside base:: fun() ");
    }
    public void gun()
    {
        System.out.println("Inside base:: gun() ");
    }
    public void sun()
    {
        System.out.println("Inside base:: sun() ");
    }
    public void mun()
    {
        System.out.println("Inside base:: mun() ");
    }
    public void mun(int no)
    {
        System.out.println("Inside base:: parameterized mun() ");
    }
}

class derived extends base
{
    public void gun()
    {
        System.out.println("Inside derived::gun() ");
    }
    public void run()
    {
        System.out.println("Inside derived::run() ");
    }
    public void mun(int no1)
    {
        System.out.println("Inside derived::mun() ");
    }
    public void sun(int no1)
    {
        System.out.println("Inside derived::sun() ");
    }
}

class overridingDemo 
{
    public static void main(String arg[])
    {
        // upcasting
        base bref = new derived();
        bref.fun();
        bref.gun();
        bref.sun();
        bref.mun();
        bref.mun(10);
        //bref.run();
    }
   
    
}
