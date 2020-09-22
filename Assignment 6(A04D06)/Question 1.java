public class d6q1
{
  public static void main(String ags[])
  {
      Par obj=new Par();
      Par ref;
      ref=obj;
      ref.show();
      
      C1 obj1=new C1();
      C1 ref1;
      ref1=obj1;
      ref1.show();
      
      C2 obj2=new C2();
      C2 ref2;
      ref2=obj2;
      ref2.show();
      
      C3 obj3=new C3();
      C3 ref3;
      ref3=obj3;
      ref3.show();
  }
}


class Par
{
    int x;
    Par()
    {
        x=14;
    }
    public void show()
    {
        System.out.println("X's Value:"+x);
    }
}

class C1 extends Par
{
    int a;
    C1()
    {
        super();
        a=7;
    }
    public void show()
    {
        System.out.println("\nX's Value is : "+x);
           System.out.println("\nA's Value is : "+a);
    }
}

class C2 extends Par
{
    int b;
    C2()
            {
               super();
               b=26;
            }
    public void show()
    {
        System.out.println("\nX's Value is : "+x);
        System.out.println("\nB's Value: "+b);
    }
}

class C3 extends Par
{
    int c;
    C3()
            {
               super();
               c=39;
            }
    public void show()
    {
       System.out.println("\nX's Value is : "+x);
         System.out.println("\nC's Value: "+c);
    }
}
