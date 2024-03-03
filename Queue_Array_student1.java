
    import java.util.Scanner;

class QueueOperations {
    Scanner sc = new Scanner(System.in);
    int rear = -1, front = -1, maxSize = 5;
    int[] arr = new int[maxSize];
    int ele;

    public boolean isFull() {
        return rear == (maxSize - 1);
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public void enqueue() {
        if (isFull()) {
            System.out.println("Queue is FULL");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }
        rear = rear + 1;
        System.out.println("Please enter an element:");
        ele = sc.nextInt();
        arr[rear] = ele;
        System.out.println("Element inserted successfully!");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY");
            return -1;
        } else {
            int deletedElement = arr[front];
            front = front + 1;
            System.out.println("Element " + deletedElement + " deleted successfully!");
            return deletedElement;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY");
        } else {
            System.out.println("The queue elements are:");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY");
            return -0;
        } else {
            return arr[front];
        }
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            return rear - front + 1;
        }
    }
}

public class Queue_Array_student1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueOperations queue = new QueueOperations();

        while (true) {
            System.out.println("Enter:\n1. Insert\n2. Delete\n3. Display\n4. Peek\n5. Size\n6. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    queue.enqueue();
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.display();
                    break;

                case 4:
                    System.out.println("The front element is: " + queue.peek());
                    break;

                case 5:
                    System.out.println("Current size of the queue is: " + queue.size());
                    break;

                case 6:
                    System.exit(0);
                    break;
            }

        }
    }
}

    

