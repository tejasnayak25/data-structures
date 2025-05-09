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

    public static void main(String[] args) {
        StackImplementation s = new StackImplementation(5);
        s.push(10);
    }
}