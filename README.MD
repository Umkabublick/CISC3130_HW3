Scenario 1 — Undo Feature:
Stack. An Undo feature follows LIFO because the most recent action should be undone first.

Scenario 2 — Printer:
Queue. A printer normally follows FIFO because the first document submitted should be printed first.

Scenario 3 — Browser Back Button:
GitHub should appear first. This resembles a Stack because the most recently visited page is returned to first.

Scenario 4 — Customer Service:
Queue. Customer service normally follows FIFO because the customer who arrived first should be helped first.

Scenario 5 — Plates:
Stack. The last plate placed on top is normally the first plate removed, so the plates follow the LIFO rule.

| Feature            | Stack           | Queue            |
| ------------------ | --------------- | ---------------- |
| Rule               | LIFO            | FIFO             |
| Add operation      | `push()`        | `enqueue()`      |
| Remove operation   | `pop()`         | `dequeue()`      |
| View next item     | `peek()`        | `peek()`         |
| First item removed | Last item added | First item added |

1. What does ADT stand for?
ADT stands for Abstract Data Type

2. What is an Abstract Data Type?
It describes what a data structure should do

3. What is the difference between an ADT and its implementation?
ADT is what it does. Implementation is how it is built

4. Can two programmers create different implementations of the same ADT?
Yes. They can build it in different ways but keep the same rules

5. If one Stack uses an array and another uses a linked list, are both still Stacks?
Yes. They are both Stacks because they follow the same Stack rules

6. What does LIFO mean?
LIFO means Last In, First Out

7. Why did 55 get removed before 15?
Because 55 was added last

8. If D was added last, which item should pop() remove first?
D

9. Give one example where a Stack could be useful.
The Undo button. The last action is undone first

10. What does FIFO mean?
FIFO means First In, First Out

11. Why was 15 removed before 55?
Because 15 was added first

12. Alex, Maria, John, and Sarah enter a line in that order. Who leaves first?
Alex

13. Give one example where a Queue could be useful.
A printer. The first document sent prints first

14. What does pop() return?
18

15. What does the final peek() return?
22

16. What does dequeue() return?
7

17. What does the final peek() return?
12

18. If a Stack uses an array, which part is the ADT?
The Stack is the ADT

19. Which part is the implementation?
The array is the implementation

20. If you replace the array with a linked list, did the ADT change?
No. Only the implementation changed