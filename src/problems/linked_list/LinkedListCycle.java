package problems.linked_list;

/**
 *
 * @author sun. on 9/9/2019.
 */
public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode c1 = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = c1;
		c1.next = b;
		System.out.println(new LinkedListCycle().hasCycle(a));
	}
}
