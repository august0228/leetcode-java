package linked_list;

/**
 *
 * @author sun. on 10/29/2019.
 */
public class RemoveNthFromEnd {

	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode fast = head;
		ListNode slow = head;

		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}

		if (fast == null) {
			return head.next;
		}

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		if (slow.next != null) {
			slow.next = slow.next.next;
		}

		return head;
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode c1 = new ListNode(4);

		a.next = b;
		b.next = c;
		c.next = c1;
		ListNode listNode = new RemoveNthFromEnd().removeNthFromEnd(a, 1);
	}

}
