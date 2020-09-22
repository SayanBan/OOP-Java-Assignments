abstract class Fir
{
    void sh()
    {
        System.out.println("Base Class");
    }
}
class Sec extends Fir
{
    void sh()
    {
        System.out.println("Derived class");
    }
}
public class C3 
{
    public static void main(String args[])
    {
        Fir ob = new Sec();
        ob.sh();
    }
    
}
