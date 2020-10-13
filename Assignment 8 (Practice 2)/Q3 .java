public class A
{
    static void display()
    {
        System.out.println("Static Base\n");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("Static derived\n");
    }
}
class thirdcaller
{
    public static void main(String args[])
    {
        B ob=new B();
        ob.display();
    }
}
