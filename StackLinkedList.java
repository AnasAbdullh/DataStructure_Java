public class Main {

    public static void main(String[] args)
    {
     
        stack st = new stack();
        
        
        
        st.display();
        st.pop();
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        
        
    }

}

class stack 
{
    private Node top;
    
    void push(int value)
    {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }
    
    void pop()
    {
        if(top == null)return;
        top = top.next;
    }
    
    int peek()
    {
        if(top == null)throw new RuntimeException("stack is Empty");
        return top.data;
    }
    
    boolean isEmpty()
    {
        return top == null;
    }
    
    
    void display()
    {
        Node temp = top;
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

    Node()
    {

    }

}

