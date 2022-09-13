package LinkedListPractice;

public class LinkedList<I extends Number> {
    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args)
    {
        Node head = new Node(5);
        head.next = new Node(10);
        Node ref = head.next;
        ref.next = new Node(20);

        while (head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
