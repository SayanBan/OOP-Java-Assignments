
//PROGRAM 3(ii) 2

class Test3ii2
{
    final int x;
    Test3ii2()
    {
        x=1055;
    }
    void display()
    {
        System.out.println("X's Value in Base class - "+x);
    }
}
class Sub_Test3ii2 extends Test3ii2
{
    void display()
    {
        System.out.println("This has been called from DERIVED CLASS");
        super.display();
    }
}
public class Caller3ii2
{
    public static void main(String args[])
    {
        Test3ii2 ob=new Test3ii2();
        Sub_Test3ii2 ob1=new Sub_Test3ii2();
        ob1.display();
    }
}
