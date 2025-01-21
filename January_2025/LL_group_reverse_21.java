
/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class LL_group_reverse_21 {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        ArrayList<Integer> l = new ArrayList<>();
        while(head != null) {
            l.add(head.data);
            head = head.next;
        }
        
        int len = l.size();
        int mod = len % k;
        
        int time = (len/k);
        
        Node dummy = new Node(-1);
        Node temp = dummy;
        int group = 0;
        while(group < time) {
            for(int i=(group*k)+k-1; i>=group*k; i--){
            temp.next = new Node (l.get(i));
            temp = temp.next;
        }
         group++;
        }
        
        if(mod!= 0){
            for(int i=len-1; i>=len-mod; i--){
            temp.next = new Node(l.get(i));
            temp = temp.next;   
            }
        }
        
        return dummy.next;
    }
}
