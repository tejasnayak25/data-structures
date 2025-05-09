public class StackImplementation {
    int[] stack;
    int size;
    int top;

    StackImplementation(int n) {
        stack = new int[n];
        size = n;
        top = -1;
    }

    void push(int x) {
        if(top == size - 1) {
            System.out.println("Overflow state");
        } else {
            top++;
            stack[top] = x;
            System.out.println(x + " is inserted into the stack");
        }
    }

    boolean isEmpty() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void pop() {
        if(isEmpty()) {
            System.out.println("Underflow state");
        } else {
            System.out.println(stack[top] + " popped");
            top--;
        }
    }

    int topElement() {
        return stack[top];
    }

    int sizeOf() {
        return top+1;
    }

    public static void main(String[] args) {
        StackImplementation s = new StackImplementation(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        s.pop();
        s.pop();
        s.pop();

        System.out.println(s.topElement() + " " + s.sizeOf());
    }
}