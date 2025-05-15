class stack
{
    private int[] array;
    private int index = -1;

    public stack(int capctiy)
    {
        this.array = new int[capctiy];
    }

    public void push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack is full");

        }
        else
        {
            this.array[++index] = item;
        }


    }

    public int pop()
    {
        int temp = array[index];
        if(isEmpty())
        {
            System.out.println("stack is Empty");
        }
        else
        {
            --index;
        }
        return temp;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("stack is Empty");
        }
        else
        {
            return array[index];
        }

        return -1;
    }

    public boolean isFull()
    {
        return index ==  array.length -1;
    }

    public boolean isEmpty()
    {
        return index == -1;
    }


}