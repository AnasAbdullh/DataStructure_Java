//import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        LinkedList link = new LinkedList();

        link.insertAsTheLastElement(1);
        link.insertAsTheLastElement(2);
        link.insertAsTheLastElement(4);

        Node Find = link.findNode(1);

        link.afterAGivenNode(Find,0);
        link.PrintElements();


    }
}

class Node
{
    public int data;
    public Node next;

    public Node(int value)
    {
        this.data = value;
        this.next = null;
    }

    public Node()
    {
        this.data = 0;
        this.next = null;
    }

}


class LinkedList
{


    private Node head;

    public void insertAsTheFirstElement(int value)
    {
        Node newNode = new Node(value);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node temp = head;

        newNode.next = temp;
        head = newNode;
    }

    public void insertAsTheLastElement(int value)
    {
        Node newNode = new Node(value);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next!= null)
        {
            temp = temp.next;
        }

        temp.next = newNode;

    }

    public Node findNode(int value)
    {
        if(head == null)return null;
        Node temp = head;

        while(temp != null && temp.data != value)
        {
            temp = temp.next;
        }
        return temp;
    }

    public void beforeAGivenNode(Node beforeNode,int value)
    {
        if(head == null || beforeNode == null)return;
        
        Node newNode = new Node(value);

        if(head == beforeNode)
        {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp != null && temp.next != beforeNode)
        {
            temp = temp.next;
        }

        if(temp != null)
        {
            temp.next = newNode;
            newNode.next = beforeNode;
        }


    }

    public void afterAGivenNode(Node afterNode,int value)
    {
        if(head == null || afterNode == null)return;

        Node newNode = new Node(value);

        Node temp = head;
        while(temp != null && temp != afterNode)
        {
            temp = temp.next;
        }

        if(temp != null)
        {
            newNode.next = temp.next;
            temp.next = newNode;

        }


    }
    
    public void beforeAGivenValue(int newValue ,int beforeValue)
    {
        if(head == null)return;
        Node newNode = new Node(newValue);

        if(head.data == beforeValue)
        {
            newNode.next = head;
            head = newNode;
            return;
        }
    
        Node temp = head;
        while(temp.next != null && temp.next.data != beforeValue)
        {
            temp = temp.next;
        }
    
        if(temp.next != null)
        {
            newNode.next = temp.next;
            temp.next = newNode;
            
        }
        
    }
    
    public void afterAGivenValue(int newValue ,int afterValue)
    {
        if(head == null)return;
        Node newNode = new Node(newValue);
        
        Node temp = head;
        while(temp != null && temp.data != afterValue)
        {
            temp = temp.next;
        }
    
        if(temp != null)
        {
            newNode.next = temp.next;
temp.next = newNode;
        }
        
    }
        

    public void PrintElements()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
