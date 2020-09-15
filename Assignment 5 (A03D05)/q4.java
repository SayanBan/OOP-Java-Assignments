class Par{
    Par()
    {
        System.out.println("Parent class constructor");
    }
}

class Chi extends Par{
    Chi()
    {
        System.out.println("Child class constructor");
    }
}
public class Assign5q4 {

    public static void main(String[] args) {
        Par ob1=new Par();
        Chi ob2=new Chi();
    }
    
}
