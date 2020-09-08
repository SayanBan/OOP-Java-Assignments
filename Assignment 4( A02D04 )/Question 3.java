public class Static_Ordinary 
{    
    Static_Ordinary () 
    { 
        System.out.println("Then constructor has been invoked"); 
    } 
    static
    { 
        System.out.println("First static is called"); 
    }  
    { 
        System.out.println("Then instance block called"); 
    } 
    static
    { 
        System.out.println("Then Second static has been called"); 
    } 
    public static void main(String[] args) 
    { 
        Static_Ordinary ob=new Static_Ordinary();
    } 
}
