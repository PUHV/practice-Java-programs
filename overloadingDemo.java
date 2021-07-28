import java.lang.*;

class bank
{
    public float interest(int amount)
    {
        System.out.println("Inside first method");
        float ret = 0.0f;
        ret = amount * 0.10f;
        return ret;
    }

    public float interest(int amount,float rate)
    {
        System.out.println("Inside second method");
        float ret = 0.0f;
        ret = amount*(rate/100);
        return ret;
    }

    public float interest(int amount, float rate, boolean type)
    {
        System.out.println("Inside third method");
        float ret = 0.0f;
        ret = this.interest(amount,rate);
        if(type == false)
        {
            return ret;
        }
        else
        {
            ret = ret + (amount*0.01f);
            return ret;
        }
    }

    public float interest(int amount, float rate, String nationality)
    {
        System.out.println("Inside fourth method");
        float ret = 0.0f;
        ret = this.interest(amount,rate);
        if(nationality == "indian")
        {
            return ret;
        }
        else if(nationality == "NRI")
        {
            ret = ret/2.0f;
            
        }
        return ret;
    }
}

class overloadingDemo 
{
    public static void main(String arg[])
    {
        bank bobj = new bank();
        System.out.println( bobj.interest(10) );
        System.out.println( bobj.interest(10, 7.5f) );

        boolean isSeniorCitizen = true;
        System.out.println( bobj.interest(10, 7.5f, isSeniorCitizen));

        System.out.println( bobj.interest(10, 7.5f, "NRI"));

    }
}
