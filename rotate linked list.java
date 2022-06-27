public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        if(head==null || head.next==null) return head;
        for(int i=0;i<k;i++){
            Node temp=head;
            while(temp.next.next!=null) 
                temp=temp.next;
            Node end=temp.next;
            temp.next=null;
            end.next=head;
            head=end;
        }
        return head;
    }
}