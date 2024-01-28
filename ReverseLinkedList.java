import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int value) {
        val = value;
        next = null;
    }
}

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    // Utility method to print the reversed list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes in the linked list: ");
        int n = scanner.nextInt();

        ListNode head = null;
        ListNode tail = null;

        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode reversedHead = reverseLinkedList.reverseList(head);

        System.out.println("Reversed linked list:");
        printList(reversedHead);

        scanner.close();
    }
}
