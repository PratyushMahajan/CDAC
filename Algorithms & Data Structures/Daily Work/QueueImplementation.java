class Queue {
    public static final int queueSize = 10;
    int[] queueline = new int[queueSize];
    private int front;
    private int rear;

    Queue() {
        front = -1; // element dequeues from front
        rear = -1; // element enqueues from rear
    }

    //isEmpty
    public boolean isEmpty() {
        return (front == -1);
    }

    //isFull
    public boolean isFull() {
        return (rear == queueSize - 1);
    }

    //Enqueue
    public void enqueue(int n) {
        if(isFull()) {
            System.out.println("Queue is full");
        }
        else {
            rear++;
            queueline[rear] = n;
            
        }
    }
    //Dequeue
    //Display
}


public class QueueImplementation {
    public static void main(String[] args) {
        
    }
}