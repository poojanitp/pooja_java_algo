package algo.queue;

public interface Queue {
    public boolean isEmpty();
    public boolean isFull();
    public void enqueue(int data);
    public int dequeue();


}
