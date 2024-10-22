class Solution {
    public int getDecimalValue(ListNode head) {
        int data=head.val;
        while(head.next!=null){
            data=data*2+head.next.val;
            head=head.next;
        }
        return data;
    }
}