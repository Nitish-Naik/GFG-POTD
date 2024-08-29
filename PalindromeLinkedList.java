class PalindromeLinkedList{
  boolean isPalindrome(Node head) {
        // Your code here
        if(head == null || head.next == null) {
            return true;
        }
        // Method - 1
        // Node temp = head;
        // Stack<Integer> s = new Stack<>();
        // while(temp != null) {
        //     s.push(temp.data);
        //     temp = temp.next;
        // }
        
        // temp = head;
        // while(temp != null && !s.isEmpty()) {
        //     if(temp.data != s.peek())
        //     {
        //         return false;
        //     }
        //     temp =temp.next;
        //     s.pop();
        // }
        // return true;
        
        
        // Method-2
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        Node newHead = reverse(slow.next);
        Node first = head;
        Node second = newHead;
        while(second != null) {
            if(first.data != second.data) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
        
    }
    
    private static Node reverse(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        Node curr = head;
        Node prev = null;
        Node forw = curr;
        while(curr != null) {
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        
        return prev;
    }
}
