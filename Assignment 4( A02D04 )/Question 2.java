import java.util.Scanner;
class emp
{
     String name,department;
    int id,doj;
    
    public emp()
    {
        name="ram";
        department="CSE";
        id=1122;
        
    }
    public emp( String name, int id, String department)
    {
        this.name=name;
        this.id=id;
        this.department=department;
    }
    public emp( String name, int id, String department, int doj)
    {
        this.name=name;
        this.id=id;
        this.department=department;
        this.doj=doj;
    }
    public void get()
    {    
                  Scanner sc=new Scanner(System.in);
          System.out.println("Enter name");
          name=sc.next();
          System.out.println("Enter id");
          id=sc.nextInt();
          System.out.println("Enter doj");
          doj=sc.nextInt();
          System.out.println("Enter department");
          department=sc.next();
         
    }
    public void display()
    {
        System.out.println("name:"+name);
         System.out.println("Id:"+id);
            System.out.println("department"+department);
            System.out.println("doj:"+doj);
    }
}
public class D4q2 {
    
    public static void main(String[] args) {
    
        emp[] e=new emp[4];
        
        for(int i=0; i<4;i++)
        {
            System.out.println("enter data with id");
            e[i]=new emp();
            e[i].get();
        }    
        
        for(int i=0;i<4;i++)
        {
            e[i].display();
        }
    }
    
}
