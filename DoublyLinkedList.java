public class Main {

    public static void main(String[] args)
    {

        LinkedList node = new LinkedList();

        node.Append(1);
        node.Append(2);
        node.Append(3);
        node.Append(4);
        node.Append(5);

        node.Display();

        //node.reverse();
       // node.removeAtPos(5);
        
       // node.remove(5);
        node.reverseDisplay();

    }

}


class Node
{
    int data;
    Node next;
    Node prev;

    Node(int value)
    {
        this.data = value;
        this.next = null;
        this.prev = null;
    }

    Node()
    {

    }

}

class LinkedList
{
    private Node head;

    void Append(int value)
    {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;


    }

    void insertAtPos(int value,int pos)
    {
        Node newNode = new Node(value);
        if(pos < 0) return;
        if(head == null)
        {
            head = newNode;
            return;
        }
        if(pos == 0)
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        for(int i = 0; temp.next != null && i < pos -1; i++)
        {
            temp = temp.next;
        }

        // لو temp != null معناها وقفنا على عقدة صالحة
        if (temp != null) {
            newNode.next = temp.next; // هنا newNode.next سيكون null طبيعيًا
            if (temp.next != null) {
                temp.next.prev = newNode; // لو كان هناك نود بعد temp
            }
            temp.next = newNode;
            newNode.prev = temp;
        }

    }
    
    void remove(int value)
    {
        if(head == null) return;
        
        if(head.data == value)
        {
            head = head.next;
            if(head != null) head.prev = null;
            return;
        }
        
        Node temp = head;
        
        while(temp != null && temp.data != value)
        {
            temp = temp.next;
        }
        
        if (temp == null) return;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        
    }
    
    void removeAtPos(int pos)
    {
        if(pos < 0 )  return;
        if(head == null) return;
        if(pos == 0)
        {
            head = head.next;
            if(head != null) head.prev = null;
            return;
        }
        
        Node temp = head;
        for(int i = 0; temp != null && i < pos ;i++)
        {
            temp = temp.next;
        }
        if(temp == null) return;
        if(temp.prev != null) temp.prev.next = temp.next;
        if(temp.next != null) temp.next.prev = temp.prev;
    }

    void Display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    void reverseDisplay()
    {
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        while(temp != null) 
        {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

}



