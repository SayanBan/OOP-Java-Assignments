public class Con
{
    Con() 
    { 
        this(20); 
        System.out.println("Default constructor"); 
    } 
    Con(int x) 
    { 
        this(25, 65); 
        System.out.println(x); 
    } 
    Con(int x, int y) 
    { 
        System.out.println(x+y); 
    } 
    public static void main(String args[]) 
    { 
        Con ob=new Con(); 
    }    
}
