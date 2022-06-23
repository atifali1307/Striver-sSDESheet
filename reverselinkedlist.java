public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
        LinkedListNode newHead=null;
        while(head!=null){
            LinkedListNode next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
            
        }
        return newHead;
    }
}