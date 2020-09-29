class Q1
{
        final void display()
        {
            System.out.println("This is a Final Method Class\n");
        }
}
public class subclass_Q1 extends Q1
{
    void show()
    {
        System.out.println("This is a Method from SUBCLASS\n");
    }
    public static void main(String args[])
    {
        Q1 obj1= new Q1();
        obj1.display();
        subclass_Q1 obj2= new subclass_Q1();
        obj2.show();
    }
}
