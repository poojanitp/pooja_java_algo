package algo.stack;
import algo.queue.*;
import algo.stack.stack;
public class Queue_implement_using_Stack implements Queue,stack{
    int capacity,size;
    int array[];
    public Queue_implement_using_Stack(int capacity){
        this.capacity=capacity;
        this.array=new int[ this.capacity];
        this.size=0;
    }

    public boolean isEmpty(){


    }
    public boolean isFull(){

    }
    public void enqueue(int data){
       this.push(data);
    }
    public int dequeue(){

        if(this.isEmpty())
             return -111111111;
        else {
            int x = this.pop();
            if (this.isEmpty()) {
                return x;
            } else {

            }
        }
    }
    public void push(int item){

    }
    public int pop(){

    }

}
