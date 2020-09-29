class Q2
{
    final void display()
    {
        System.out.println("This is a Final Method from CLASS\n");
    }
}
public class subclass_Q2 extends Q2
{
    void display()
    {
        System.out.println("This is a Method from SUBCLASS");
    }
    public static void main(String args[])
    {
        Q2 obj1= new Q2();
        obj1.display();
        subclass_Q2 obj2= new subclass_Q2();
        obj2.display();
    }
}
