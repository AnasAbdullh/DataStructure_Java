
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
     
     node.reverse();
     node.Display();
     
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

class LinkedList
{
   private Node head;
 
   public void Append(int value)
   {
     Node new_Node = new Node(value);
    
    if(head == null)
    {
     head = new_Node;
     return;
    }
    
    Node temp = head;
    
    while(temp.next != null)
    {
     temp = temp.next;
    }
    temp.next = new_Node;
    
   }
 
 public void Display()
 {
  
  Node temp = head;
  while(temp != null)
  {
   System.out.println(temp.data);
   temp = temp.next;
  }
  System.out.println();
  
 }
 public boolean Remove(int value)
 {
  if(head == null)
  {
   return false;
  }
  if(head.data == value)
  {
   head = head.next;
   return true;
  }
  Node Temp = head;
  while(Temp.next != null && Temp.next.data != value )
  {
   Temp = Temp.next;
  }
  
  if(Temp.next !=null)
  {
   Temp.next = Temp.next.next;
   return true;
  }
  
  return false;
  
 }
 
 public boolean insertAtPos(int value,int pos)
 {
  Node newNode = new Node();
  newNode.data = value;
  
  if(pos < 0) return false;
  
  
  if(head == null || pos == 0){
   newNode.next = head;
   head = newNode;
   return true;
  }
  
  Node temp = head;
  for(int i = 0 ; temp != null && i < pos -1 ; i++)
  {
   temp = temp.next;
  }
  
  if(temp != null)
  {
   newNode.next = temp.next;
   temp.next = newNode;
   return true;
  }
  
  return false;
 }
 
 public boolean removeAtPos(int pos)
 {
  if(pos < 0 || head == null) return false;
  if(pos == 0)
  {
   head = head.next;
   return true;
  }
  
  Node temp = head;
  for(int i = 0; temp != null && i < pos -1;i++)
  {
   temp = temp.next;
  }
  
  
  if(temp != null && temp.next != null)
  {
   temp.next = temp.next.next;
   return true;
  }
  
  return false;
  
 }
 
 public void reverse()
 {
  if(head == null) return;
  if(head.next == null) return;
  
  Node next = null;
  Node curr = head;
  Node prev = null;
  
  // 3 10
  
  while(curr != null)
  {
   next = curr.next;
   curr.next = prev;
   prev = curr;
   curr = next;
  }
  
  head = prev;
  
 }

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
 
 
}

