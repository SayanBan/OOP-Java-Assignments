public class Stud {
   public final String name;
   public final int age;
   public final Stud(){
      this.name = "Deba";
      this.age = 21;
   }
   public void display(){
      System.out.println("Name of the Student: "+this.name );
      System.out.println("Age of the Student: "+this.age );
   }
   public static void main(String args[]) {
      new Student().display();
   }
}
