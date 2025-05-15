package src;
import src.utils.Calculator;

public class Main
{
   public static void main(String[] args)
   {
     //Calculator calc = new Calculator();
     //System.out.println("5 + 3 = " + calc.add(5, 3));
     
     Queue Qu = new Queue(5);
     Qu.Enqueue(1);
     Qu.Enqueue(2);
     Qu.Dequeue();
     Qu.Dequeue();
     
     // 0 1 2 3 4
     // 1 2 3 4 5
     
     
     //System.out.println(1 / 5);
     
     int [] arr = new int[5];
     for(int i = 0 ;i <arr.length ;i++)
     {
       arr[i] = i + 1;
     }
     
     int rear = arr.length -1;
     
     for(int i = 0 ;i <arr.length -1 ;i++)
     {
       arr[i] = arr[i + 1];
       // 2 3 4 5
     }
     
     
     
     /*for(int h : arr)
     {
       // System.out.println(h);
     }
     */
     for(int i = 0 ;i < rear ;i++)
     {
    //  System.out.println(arr[i]);
     }
     
     Test Q = new Test(4);
     
     Q.enqueue(1);
     Q.enqueue(2);
     Q.enqueue(3);
     
     Q.printque();
     
     Q.dequeue();
     
     Q.printque();
     Q.enqueue(4);
     Q.printque();
     System.out.println("-------");
     Q.enqueue(5);
     Q.printque();
     
     
   }
        
}


class Test
{
    int front, rear, size;
    int queue[];
    Test(int size) {
        front = rear = -1;
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int item)  {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front==-1) front=0;
            rear = (rear + 1) % size;
            queue[rear] = item;
        }
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Removing " + queue[front]);
            
            if (front == rear) {
    front = rear = -1;
} else {
    front = (front + 1) % queue.length;
}
          
        }
    }
    
    public boolean isEmpty()
    {
      return rear == -1 && front == -1;
    }
    
    public boolean isFull()
    {
      return (rear +1) %  size == front;
    }
    
    
    void printque() {
    if (isEmpty()) {
        System.out.println("Queue is Empty");
        return;
    }

    System.out.print("Queue elements: ");
    int i = front;
    while (true) {
        System.out.print(queue[i] + " ");
        if (i == rear)
            break;
        i = (i + 1) % queue.length;
    }
    System.out.println();
   }


}
 

class Queue {
    private int front, rear;  // Changed initialization
    private int[] array;
    private int capacity;     // Added to track capacity

    public Queue(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = 0;      // Initialize front to 0
        this.rear = -1;      // Initialize rear to -1
    }

    public void Enqueue(int item) {  // Fixed method name spelling
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        this.array[++rear] = item;
    }

    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            System.exit(1);
        } 
        return array[front++];  // Return and increment front
    }

    public int Front() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return array[front];
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public boolean isEmpty() {
        return front > rear || rear == -1;  // Simplified condition
    }
}
