package lt.sdaacademy.algorithmsanddatastructure.datastructures.stack;

public class CustomStack {
    private int[] arr;
    private int size;
    private int top;

    public CustomStack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int num) {
        // ar stack nėra perpildytas
        if (isFull()) {
            System.out.println("Stack is full");
        }
        top++;
        arr[top] = num;
    }

    public int pop() {
       if (isEmpty()){
           System.out.println("Stack is empty");
       }
       int element = arr[top];
       top--;
       return element;
    }

    public int peak(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }
        return arr[top];
    }

    private boolean isFull() {
        return top == size;
    }
    public boolean isEmpty(){
        return top<0;
    }
}
