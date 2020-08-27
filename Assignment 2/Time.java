/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARZANISH
 */
import java.util.*;
public class Time {
    Scanner sc = new Scanner(System.in);
    int h,m,s;
    void set()
    {
        System.out.print("Enter Hours Minutes and Seconds :");
        
        h=sc.nextInt();
        m=sc.nextInt();
        s=sc.nextInt();
    }
    
    void add()
    {
        int a,b,c;
        System.out.print("Enter Hours Minutes and Seconds to ADD :");
        
        
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        h=h+a;
        m=m+b;
        s=s+c;
    }
    
    void show()
    {
        if(m>61)
        {
            int j = m/60;
            int f = m%60;
            h=h+j;
            m=f;
        }
        if(s>61)
        {
           int j=s/60;
           int i=s%60;
           m=m+j;
           s=i;
        }
        System.out.println("Hours :"+h+"\n Minutes :"+m+" \nSeconds :"+s);
    }
    
    public static void main(String args[])
    {
        
        Time obj= new Time();
        obj.set();
        obj.show();
    }
}
