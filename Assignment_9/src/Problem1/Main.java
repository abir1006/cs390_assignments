package Problem1;

public class Main {
    public static void main(String[] args) {

        ArrayQueueImpl queue = new ArrayQueueImpl();
        queue.enqueue(12);
        queue.enqueue(3);
        queue.enqueue(4);


        //System.out.println(queue.peek());
        queue.enqueue(-3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
