
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}




public class RotateLinkedList {
    public  Node rotate(Node head, int k) {
        if(head==null || head.next==null)return head;
    
        Node tmp = head;
        int cnt = 0;
        while(tmp != null){
            tmp=tmp.next;
            cnt++;
        }
        tmp=head;
        k %= cnt;
        if(k==0)return head;
        while(k-- > 0)
            tmp = tmp.next;
        Node tmpHead = head;
        while(tmp.next != null){
            tmp = tmp.next;
            head = head.next;
        }
        Node newHead = head.next;
        tmp.next = tmpHead;
        head.next = null;
        return newHead;
    }
    
}