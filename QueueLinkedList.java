public class Main {

    public static void main(String[] args)
    {
     
       /* stack st = new stack();
        
        
        
        st.display();
        st.pop();
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        
        */
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.dequeue();
        }
        
        
    }

}

class Queue 
{
    private Node front = null;
    private Node tail = null;
    
    void enqueue(int value)
    {
        Node newNode = new Node(value);
        if(front == null)
        {
          front = tail = newNode;
            return;
        }
        
       tail.next = newNode;
        tail = newNode;
        
    }
    
   void dequeue()
    {
        if(front == null) return;
        if(front == tail)
        {
            front = tail = null;
            return;
        }
        
        front = front.next;
    }
    
    int peek()
    {
        if(front == null) return -1;
        return front.data;
    }
    
    
    boolean isEmpty()
    {
        return front == null && tail == null;
    }
    
    
    void display()
    {
        Node temp = front;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


class Node
{
    int data;
    Node next;

    Node(int value)
    {
        this.data = value;
        this.next = null;
    }
    

}

