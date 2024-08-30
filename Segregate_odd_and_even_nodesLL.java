public Segregate_odd_and_even_nodesLL {
  static class Node{
        int data;
        Node next;
    
        Node(int x){
            data = x;
            next = null;
        }
    }

    static Node head = null;

    public static void create(int data) {
        Node nn= new Node(data);
        if(head == null) {
            head = nn;
            return;
        }

        nn.next = head;
        head = nn;
    }

    Node divide() {
        
        // code here

        if(head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        Node even = new Node(-1);
        Node evenHead = null;
        Node odd = new Node(-1);
        Node oddHead = null;
        
        while(temp != null) {
            if(temp.data % 2 == 0) {
                even.next = temp;
                temp = temp.next;
                if(evenHead == null) evenHead = even.next;
                even = even.next;
            }
            else {
                odd.next = temp;
                temp = temp.next;
                if(oddHead == null) oddHead = odd.next;
                odd = odd.next;
            }
        }
        odd.next = null;
        even.next = oddHead;
        head = evenHead;
        return head;
    }

    public static void print() {
        Node temp = head;
        while(temp != null) {
            if(temp.next == null) {
                System.out.print(temp.data);
                return;
            }
            System.out.print(temp.data + "-> " );
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        int []a = {6, 4, 2, 9, 8, 15, 17};

        Solution s = new Solution();
        for(int i: a) {
            s.create(i);
        }
        s.divide();
        s.print();
    }
}
