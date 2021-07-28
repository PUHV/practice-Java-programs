// import java.lang.*;

// class base
// {
//     public int i = 10;
//     public static int j = 20;

//     public base()
//     {
//         System.out.println("Inside base constructor");
//     }

//     public void fun()
//     {
//         System.out.println("base fun");
//     }

//     public static void gun()
//     {
//         System.out.println("base gun");
//     }

//     public void sun()
//     {
//         System.out.println(this.i);//
//         System.out.println(this.j);
//         this.fun();
//         this.gun();
//     }

//     public base(int no)
//     {
//         this();
//         System.out.println("parameterized constructor");
//     }
// }

// class derived extends base
// {
//     public int i = 30;

//     public derived()
//     {
//         System.out.println("Default derived constructor");
//     }

//     public derived(int no)
//     {
//         this();
//         super(11);
//         System.out.println("parameterized derived constructor");
//     }

//     public void fun()
//     {
//         System.out.println("Derived fun");
//         super.fun();
//         this.run();
//         System.out.println(this.i);
//         System.out.println(super.i);
//     }

//     public void run()
//     {
//         System.out.println("Derived run");
//     }
// }
// class superDemo 
// {
//     public static void main(String arg[])
//     {
//         base bobj1 = new base();
//         base bobj2 = new base(21);
//         bobj1.fun();
//         bobj1.gun();
        
//         base.fun();
//         base.gun();
        
//         bobj1.sun();
        
//         derived dobj1 = new derived();
//         derived dobj2 = new derived(51);
        
//         dobj.fun();
//         dobj.sun();

//     }
// }
