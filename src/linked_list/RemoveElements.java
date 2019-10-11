package linked_list;

/**
 *删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 * @author sun. on 9/28/2019.
 */
public class RemoveElements {

	public ListNode removeElements(ListNode head, int val) {
		ListNode header = new ListNode(-1);
		header.next = head;
		ListNode curr = header;
		while (curr.next != null) {
			if (curr.next.val == val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
		return header.next;
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
//		ListNode b = new ListNode(2);
//		ListNode c = new ListNode(2);
//		a.next = b;
//		b.next = c;

		new RemoveElements().removeElements(a, 1);
	}
}
