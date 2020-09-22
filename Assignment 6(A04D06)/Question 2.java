class A1
{
    void sh()
    {
        System.out.println("Base Class");
    }
}
class B1 extends A1
{
    void sh()
    {
        System.out.println("\nClass B1 & Derived A1 Class. ");
    }
}
class C1 extends A1
{
    void sh()
    {
        System.out.println("\n Class C1 & Derived A1 Class. ");
    }
}
class D1 extends A1
{
    void sh()
    {
        System.out.println("\n Class D1 & Derived A1 class.");
    }
}
public class Caller2 
{
    public static void main(String args[])
    {

        A1 ob=new A1();
        A1 ob1=new B1();
        A1 ob2=new C1();
        A1 ob3=new D1();
        ob.sh();
        ob1.sh();
        ob2.sh();
        ob3.sh();
    }
    
}
