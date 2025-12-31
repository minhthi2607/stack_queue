package bai5;

public class Solution {

    Queue queue = new Queue();

    public void enQueue(int value) {
        Node newNode = new Node(value);


        if (queue.front == null) {
            queue.front = queue.rear = newNode;
            queue.rear.link = queue.front;
        } else {
            queue.rear.link = newNode;
            queue.rear = newNode;
            queue.rear.link = queue.front;
        }
    }


    public void deQueue() {

        if (queue.front == null) {
            System.out.println("Queue is empty");
            return;
        }


        if (queue.front == queue.rear) {
            queue.front = queue.rear = null;
        } else {
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
    }


    public void displayQueue() {
        if (queue.front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = queue.front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != queue.front);

        System.out.println();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        s.enQueue(10);
        s.enQueue(20);
        s.enQueue(30);

        s.displayQueue();

        s.deQueue();
        s.displayQueue();

        s.deQueue();
        s.deQueue();
        s.displayQueue();
    }
}
