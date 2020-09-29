
// PROGRAM QUESTION 3(ii) 1

class Test3ii
{
    final int x;
    {
        x=1055;
    }
    void display()
    {
        System.out.println("X's Base class value : "+x);
    }
}
class Sub_Test3ii extends Test3ii
{
    void display()
    {
        System.out.println("This is Called from the DERIVED CLASS");
        super.display();
    }
}
public class Caller3ii
{
    public static void main(String args[])
    {
        Test3ii ob=new Test3ii();
        Sub_Test3ii ob1=new Sub_Test3ii();
        ob1.display();
    }
}
