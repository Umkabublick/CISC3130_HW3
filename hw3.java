public class hw3 {

    // Stack
    static class MyStack {

        private int[] stack;
        private int top;

        public MyStack() {
            stack = new int[10];

            top = -1; // Stack is empty
        }

        public void push(int value) { // Move top to the next position and add the new value there
            top++;
            stack[top] = value;
        }

        public int pop() { // Save the top value before moving the top position down
            int value = stack[top];
            top--;
            return value;
        }

        public int peek() { // Return the top value without removing it
            return stack[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    // Queue
    static class MyQueue {

        private int[] queue;
        private int front;
        private int rear;

        public MyQueue() {
            queue = new int[10];
            front = 0; // front points to the first item
            rear = -1; // rear points to the last item
        }

        public void enqueue(int value) { // Move rear forward and add the new item
            rear++;
            queue[rear] = value;
        }

        public int dequeue() { // Save the front item, then move front to the next item
            int value = queue[front];
            front++;
            return value;
        }

        public int peek() { // Return the front item without removing it
            return queue[front];
        }

        public boolean isEmpty() { // If front has moved past rear, there are nothing left
            return front > rear;
        }
    }

    // Main Method
    public static void main(String[] args) {

        // Stack Demonstration
        MyStack myStack = new MyStack();

        System.out.println("STACK DEMONSTRATION");

        System.out.println("Adding:");

        myStack.push(13);
        System.out.println(13);

        myStack.push(25);
        System.out.println(25);

        myStack.push(36);
        System.out.println(36);

        myStack.push(47);
        System.out.println(47);

        myStack.push(52);
        System.out.println(52);

        System.out.println();

        System.out.println("Top item:");
        System.out.println(myStack.peek());

        System.out.println();

        System.out.println("Removing:");
        System.out.println(myStack.pop());

        System.out.println();

        System.out.println("Removing:");
        System.out.println(myStack.pop());

        System.out.println();

        System.out.println("New top:");
        System.out.println(myStack.peek());

        System.out.println();

        System.out.println("Is Stack empty?");
        System.out.println(myStack.isEmpty());

        // Queue Demonstration
        System.out.println();
        System.out.println("QUEUE DEMONSTRATION");

        MyQueue myQueue = new MyQueue();

        System.out.println("Adding:");

        myQueue.enqueue(13);
        System.out.println(13);

        myQueue.enqueue(25);
        System.out.println(25);

        myQueue.enqueue(36);
        System.out.println(36);

        myQueue.enqueue(47);
        System.out.println(47);

        myQueue.enqueue(52);
        System.out.println(52);

        System.out.println();

        System.out.println("Front item:");
        System.out.println(myQueue.peek());

        System.out.println();

        System.out.println("Removing:");
        System.out.println(myQueue.dequeue());

        System.out.println();

        System.out.println("Removing:");
        System.out.println(myQueue.dequeue());

        System.out.println();

        System.out.println("New front:");
        System.out.println(myQueue.peek());

        System.out.println();

        System.out.println("Is Queue empty?");
        System.out.println(myQueue.isEmpty());
    }
}