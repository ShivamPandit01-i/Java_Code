class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseList {

    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;
        ListNode temp;

        while (curr != null) {

            temp = curr.next;

            curr.next = prev;

            prev = curr;

            curr = temp;
        }

        return prev;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ReverseList obj = new ReverseList();

        ListNode reversed = obj.reverseList(head);

        while (reversed != null) {
            System.out.print(reversed.val + " -> ");
            reversed = reversed.next;
        }

        System.out.print("null");
    }
}