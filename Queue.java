
public class Main
{
   public static void main(String[] args)
   {
        Queue Que = new Queue(5);
        
        Que.Enqeueu(1);
        Que.Enqeueu(2);
        Que.Enqeueu(3);
        Que.Enqeueu(4);
        Que.Enqeueu(5);
        //Que.Enqeueu(5);
        
        
        while(!Que.isEmpty())
        {
         System.out.println(Que.Dequeue());
        }
        
        System.out.println(Que.Front());
        System.out.println(Que.isEmpty());
        System.out.println(Que.isFull());
        
/*       System.out.println(Que.Dequeue());
       System.out.println(Que.Dequeue());
       System.out.println(Que.Dequeue());
       System.out.println(Que.Dequeue());
       System.out.println(Que.Dequeue());
       System.out.println(Que.Dequeue());*/
       
        
        /*System.out.println(Que.Front());
        Que.Dequeue();
        System.out.println(Que.Front());
        System.out.println(Que.isEmpty());
        System.out.println(Que.isFull());*/
     
   }
    
}

class Queue
{
 private int front = 0, rear = -1;
 private int [] array;
 
 public Queue(int capcity)
 {
   this.array = new int[capcity];
 }
 
 public void Enqeueu(int item)
 {
   if(isFull()) 
   {
     System.out.println("Queue is full");
   }
   else
   {
     this.array[++rear] = item;
   }
 }
 
 public int Dequeue()
{
   if(isEmpty())
   {
     System.out.println("Queue is Empty");
     System.exit(1);
   }

   return array[front++];
    
}
 
 public int Front()
 {
   if(isEmpty())
   {
     System.out.print("Queue is Empty");
     System.exit(1);
   }
   
   return array[front + 1]; 
 }
 
 public boolean isFull()
 {
   return rear == array.length -1;
 }
 
 public boolean isEmpty()
 {
   return rear == -1 || front > rear;
 }
 
}


