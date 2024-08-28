class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SortLinkedList {
    // Method 1: Count and Reconstruct
    static Node segregateByCounting(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Count occurrences of 0s, 1s, and 2s
        int count0 = 0, count1 = 0, count2 = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                count0++;
            } else if (temp.data == 1) {
                count1++;
            } else {
                count2++;
            }
            temp = temp.next;
        }

        // Reconstruct the list based on counts
        temp = head;
        while (temp != null) {
            if (count0 > 0) {
                temp.data = 0;
                count0--;
            } else if (count1 > 0) {
                temp.data = 1;
                count1--;
            } else {
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }

        return head;
    }
    
    // Method 2: Using Three Separate Lists
    static Node segregateByLists(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize dummy nodes for 0, 1, and 2 lists
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        // Pointers to build the three lists
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;

        // Traverse the original list and distribute nodes to the 0, 1, and 2 lists
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        // Connect the three lists
        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;  // Important to end the last list

        // Update the head of the list to point to the start of the 0 list
        head = zeroHead.next;

        return head;
    }

    public static void main(String[] args) {
        System.out.println(89);
    }
}
