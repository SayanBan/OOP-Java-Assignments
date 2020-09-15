class Stat_Non_Stat
{
    Stat_Non_Stat()
    {
        System.out.println("\nBase Class of Derive_Constructor");
    }
    {
        System.out.println("Non Static Block of Base Class");
    }
    static
    {
        System.out.println("Static Block of Base Class");
    }
}
class Derive_Static_Non_Static extends Stat_Non_Stat
{
    Derive_Static_Non_Static()
    {
        System.out.println("\nDerived class Constructor is called.");
    }
    {
        System.out.println("Derived Class's Non Static Block");
    }
    static
    {
        System.out.println("Derived Class's Static Block");
    }
}
public class Caller6
{
    public static void main(String args[])
    {
        System.out.println("Creating only Derived class object:\n ");
        Derive_Static_Non_Static ob=new Derive_Static_Non_Static();
    } 
}
