package algo.stack;
import algo.queue.*;
public class StackByQueue implements stack{
    private ArrayQueue q1,q2;
    public StackByQueue(int capacity){
        q1=new ArrayQueue(capacity);
        q2=new ArrayQueue(capacity);
    }
    public void push(int item){
        if(!q1.isEmpty())
            q1.enqueue(item);
        else
            q2.enqueue(item);


    }
    public int pop(){
        int item=0;
        if(this.isEmpty()){
            System.out.println("underflow-----------");
            return -11111;
        }
        else
        {

            // System.out.println("-----------");
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    item=q1.dequeue();
                    if(!q1.isEmpty())
                        q2.enqueue(item);
                }

                return item;
            }
            else{
                while (!q2.isEmpty()){
                    item=q2.dequeue();
                    if(!q2.isEmpty())
                        q1.enqueue(item);
                }
                return item;
            }
        }

    }
    public boolean isEmpty(){
        if(q1.isEmpty() && q2.isEmpty())
            return true;
        else
            return false;
    }
}
