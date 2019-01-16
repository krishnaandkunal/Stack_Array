public class MyStack {
    int size;
    int top;
    int stackarray[];

    public MyStack()
    {
        size = 10;
        top = -1;
        stackarray = new int[size];
    }
    public boolean isFull()
    {
        return (top == stackarray.length -1);
    }
    public boolean isEmpty()
    {
        return (top == -1);
    }
    public void push(int x)
    {
        if (!isFull())
        {
            top++;
            stackarray[top] = x;
        }
    }
    public int pop()
    {
        if(!isEmpty())
        {
            return stackarray[top--];
        }
        else
            return -1;
    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.push(70);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }
}
