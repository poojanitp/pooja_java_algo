
import algo.stack.*;
public class Main {
    public static void main(String args[]){
        StackByQueue s1=new StackByQueue(5);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
      //  s1.push(7);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
       // System.out.println(s1.pop());
    }
}
