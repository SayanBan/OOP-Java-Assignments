abstract class A
{
    int x;
    abstract static void display();
}
class B extends A
{
    static void display()
    {
        System.out.println("In Sub class");
    }
}
public class SecCaller
{
    public static void main(String args[])
    {
        B ob=new B();
        ob.display();
    }
}
