package algo.queue;

public class ArrayQueue implements Queue {
    private int capacity,front,rear;
    private int array[];
    public ArrayQueue(int capacity){
        this.capacity=capacity;
        this.front=-1;
        this.rear=-1;
        array=new int[this.capacity];
    }
    public void enqueue(int item){
        if(this.isFull()){
            System.out.println("overflow-------");
            return;
        }

        if(this.rear==-1 && this.front==-1)
            this.rear=this.front=0;
        else
            this.rear=(this.rear+1)% this.capacity;

        array[this.rear]=item;


    }
    public int dequeue(){
        if(this.isEmpty()){
            System.out.println("UnderFlow-------");
            return -1111;
        }

        int item=array[this.front];
        if(this.front==this.rear)
            this.front=this.rear=-1;
        else
            this.front=(this.front+1) % this.capacity;

        return item;


    }
    public boolean isEmpty(){
        if(this.front==-1 && this.rear==-1)
            return true;
        else
            return false;

    }

    public boolean isFull() {
        if ((this.rear + 1) % this.capacity == this.front)
            return true;
        else
            return false;
    }


}
