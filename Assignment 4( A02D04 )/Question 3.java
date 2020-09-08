public class ord 
{  
    ord() 
    { 
        System.out.println("Constructor invoked"); 
    } 
    { 
        System.out.println("First Ordinary Block Executed"); 
    } 
    { 
        System.out.println("First Ordinary Block Executed"); 
    } 
    public static void main(String[] args) 
    { 
        System.out.println("No object created yet so ordinary block not executed");
        ord ob=new ord();
        System.out.println("\n Object is created only when all ordinry blocks have been executed and\n also the blocks executed in sequential order in which they were created");
    } 
}
