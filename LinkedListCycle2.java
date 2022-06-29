public class Solution 
{
    public static Node firstNode(Node head) 
    {
        //    Write your code here.
        HashSet<Node> st=new HashSet<>();
        while(head!=null){
            if(st.contains(head)) return head;
            st.add(head);
            head=head.next;
        }
        return null;
    }
}