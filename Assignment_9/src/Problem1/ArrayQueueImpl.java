package Problem1;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;
    public int peek() {
        return arr[front];
    }
    public void enqueue(int obj){
        //implement
        if (rear == arr.length) {
            resize();
        }
        front = front == -1 ? 0 : front;
        arr[rear++] = obj;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int obj = arr[front];
        arr[front] = 0;
        front++;
        if (front == rear) {
            front = rear = 0;
        }
        return obj;
    }
    public boolean isEmpty(){
        //implement
        return front == -1 || front == rear;
    }
    public int size(){
        //implement
        return rear - front;
    }
    private void resize(){
        //implement
        int[] tmp = new int[arr.length * 2];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        arr = tmp;
    }
}

