public class Student {
    int roll;
    String name,stream,college;
    Student(int ro,String nam,String str,String cg)
    {
        name=nam;
        roll=ro;
        stream=str;
        college=cg;
    }
    void display()
    {
        System.out.println(name+"\t"+roll+"\t"+stream+"\t"+college);
    }
    public static void main(String args[])
    {
        
        Student ob=new Student(1040,"Sayan Banerjee","CSE","Techno India University");
        
        Student ob1=new Student(1007,"James Bond","ECE","CalTech");
        
        System.out.println("Name\t\tRoll no\tStream\tcollege");
        
        ob.display();
        ob1.display();
    }
    
}
