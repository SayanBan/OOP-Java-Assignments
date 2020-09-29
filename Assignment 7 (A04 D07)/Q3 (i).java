
// PROGRAM QUESTION 3 (i)

class Test
{
    final int x=1055;
    void display()
    {
        System.out.println("X's Value in base class is - "+x);
    }
}
class SubTest extends Test
{
    void display()
    {
        super.display();
    }
}
public class thirdcaller
{
    public static void main(String args[])
    {
        SubTest ob=new SubTest();
        ob.display();
    }
}
