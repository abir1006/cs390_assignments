package Problem2;

public class Main {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList(5);
        stack.push(12);
        stack.push(11);
        stack.push(3);
        stack.push(10);
        stack.push(15);

        System.out.println(stack.peek());

        stack.printStack();


    }
}
