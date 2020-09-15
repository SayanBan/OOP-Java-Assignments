class Emp
{
    String name;
    int id;
    Emp(String s,int n)
    {
        name=s;
        id=n;
    }
    public void display()
    {
        System.out.println("Base Class of Scientist");
    }
}
class Scientist extends Emp
{
    int no_of_publication,experience;
    Scientist(int nfp,int exp)
    {
        super("Sayan Badyopadhyay",1040);
        no_of_publication=nfp;
        experience=exp;
    }
    public void display()
    {
        System.out.println("Base Class of DScientist");
    }
}
class DScientist extends Scientist
{
    String award;
    DScientist(String aw)
    {
        super(8,18);
        award=aw;
    }
    public void display()
    {
        System.out.println("Derived Class\n");
        System.out.println("Name : "+name+"\tID : "+id+"\nNo of Publication : "+no_of_publication+"\tExperience : "+experience);
        System.out.println("Award : "+award);
    }
}
public class first_caller
{
    public static void main(String args[])
    {
        Emp ob=new Emp("Sayan Bandyopadhyay",1040);
        Scientist ob1=new Scientist(8,18);
        DScientist ob2=new DScientist("Nerd");
        ob.display();
        ob1.display();
        ob2.display();
    }
}
