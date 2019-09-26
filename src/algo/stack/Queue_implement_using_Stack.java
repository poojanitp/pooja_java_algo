package algo.stack;
import algo.queue.*;
import algo.stack.stack;
public class Queue_implement_using_Stack implements Queue,stack{
    int capacity,size;
    int array[];
    public Queue_implement_using_Stack(int capacity){
        this.capacity=capacity;
        this.array=new int[this.capacity];
        this.size=-1;
    }

    public boolean isEmpty(){
        if(this.size==-1)
            return true;
        return false;

    }
    public boolean isFull(){
        // System.out.println(this.capacity-1+"--"+this.size);
        if((this.size+1)>=(this.capacity))
            return true;
        return false;
    }
    public void enqueue(int data){
        this.push(data);
    }
    public int dequeue(){

        if(this.isEmpty())
        {
            System.out.println("stack underflow");
            return -111111111;
        }
        else {
            int x = this.pop();
            if (this.isEmpty()) {
                //  System.out.println("---------------" +x);
                return x;
            } else {
                int item=this.dequeue();
                this.enqueue(x);
                return item;
            }
        }
    }
    public void push(int item){

        // System.out.println("Stack OverFlow"+ this.size);
        if(this.isFull()){
            System.out.println("Stack OverFlow");
            return;
        }
        else {
            this.size=this.size+1;
            array[this.size]=item;

        }
    }
    public int pop(){
        int item=array[this.size];
        this.size=this.size-1;
        // System.out.println(item);
        return item;

    }

    public static void main(String args[]){
        Queue_implement_using_Stack qs=new Queue_implement_using_Stack(5);
        qs.enqueue(3);
        qs.enqueue(4);
        System.out.println(qs.dequeue());
        qs.enqueue(5);
        qs.enqueue(6);
        qs.enqueue(7);
        qs.enqueue(8);

        System.out.println(qs.dequeue());   System.out.println(qs.dequeue());   System.out.println(qs.dequeue());
        System.out.println(qs.dequeue());   System.out.println(qs.dequeue());

    }


}
