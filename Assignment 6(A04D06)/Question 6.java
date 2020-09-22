abstract class Par
{
    void sh()
    {
        System.out.println("Parent Method shown");
    }
}
class Ch extends Par
{
    void sh()
    {
        System.out.println("Child Method shown");
    }
}
public class Caller6
{
    public static void main(String args[])
    {
        Par ob=new Ch(); 
        //Upcasting
        ob.sh();
        Ch ob1=(Ch)ob;  
        //Downcasting
        ob1.sh();
    }
}
