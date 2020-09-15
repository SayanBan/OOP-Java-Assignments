class q1{
    void show(){
        System.out.println("Object of 1st class");
    }
}

class q2 extends q1{
    void show(){
        System.out.println("Object of 2nd class");
    }
}


class q3 extends q1{
    void show(){
        System.out.println("Object of 3rd class");
    }
}


class q4 extends q1{
    void show(){
        System.out.println("Object of 4th class");
    }
}

public class Assign5q2 {

    
    public static void main(String[] args) {
     q1 ob1 =new q1();
     ob1.show();
     q2 ob2 =new q2();
     ob2.show();
     q3 ob3 =new q3();
     ob3.show();
     q4 ob4 =new q4();
     ob4.show();
    }
    
}
