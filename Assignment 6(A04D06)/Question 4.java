abstract class One
{
    abstract void g();
    abstract void add();
    abstract void sh();
}
class Two extends One
{
    int x1,x2,sum;
    Two()
    {
        x1=7;
        x2=19;
    }
    void add()
    {
        sum=x1+x2;
    }
    void sh()
    {
        System.out.println("Derived class");
        System.out.println("Sum of "+x1+" + "+x2+" is : "+sum);
    }
}
public class Caller4 
{
    public static void main(String args[])
    {
        Two ob=new Two();
        ob.sh();
    }    
}
