package LinkedListPractice;

public class InsertionAtStartAndEndOfLinkedList
{
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

    //Function to insert a node at the beginning of the linked list.
    static Node insertAtBeginning(Node head, int x)
    {
        Node firstNode = new Node(x);
        firstNode.next = head;
        return firstNode;
    }

    //Function to insert a node at the end of the linked list.
    static Node insertAtEnd(Node head, int x)
    {
        if (head == null)
        {
            return new Node(x);
        }
        Node ref = head;
        while(head.next != null)
        {
            head = head.next;
        }
        head.next = new Node(x);
        return ref;
    }

    static Node deletionOfNode(Node head, int x)
    {
        Node ref = head.next;
        Node prev = head;

        if (head.data == x)
        {
            head = head.next;
        }

        while(ref != null)
        {
            if (ref.data == x)
            {
                prev.next = ref.next;
            }
            prev = prev.next;
            ref = ref.next;
        }
        return head;
    }

    public static void main(String[] args)
    {
        Node head = new Node(5);
        head.next = new Node(10);
        Node ref = head.next;
        ref.next = new Node(20);

        head = insertAtBeginning(head, 0);

        head = insertAtEnd(head, 40);

        head = deletionOfNode(head, 40);

        while (head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
