class Stack {

    private static final int maxStackSize = 10;
    int[] stackArray = new int[maxStackSize];

    private int top = -1;

    public boolean isEmpty() {
        return (top < 0);
    }

    // Push
    public void push (int n) {
        if(top >= maxStackSize - 1) {
            System.out.println("Stack Overflow");
        }
        else {
            top++;
            stackArray[top] = n;
            System.out.println("Stack Index "+ top + " : "+ n + " pushed");
        }
    }

    //Pop
    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
        }
        else {
            System.out.println("Stack Index "+ top + " : "+ stackArray[top] + " popped");
            top--;
        }
    }

    //Peek 
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        else {
            System.out.println("Top element is: " +stackArray[top]);
            return stackArray[top];
        }
    }

    //Display 
    public void display() {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
        }
        else {
            System.out.println("Stack elements are: ");
            for(int i=top; i>=0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }

}

public class StackImplementation {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.pop();
        s.peek();
        s.display();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
        s.pop();
        s.peek();
        s.display();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.display();
        s.push(7);
    }
}