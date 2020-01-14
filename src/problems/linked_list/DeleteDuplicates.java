package problems.linked_list;

/**
 *给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author sun. on 9/28/2019.
 */
public class DeleteDuplicates {

	public ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode prev = head;
		ListNode current = head.next;
		while (current != null) {
			if (prev.val == current.val) {
				ListNode next = current.next;
				prev.next = next;
				current = current.next;
			} else {
				prev = prev.next;
				current = current.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(2);
		ListNode d= new ListNode(3);
		ListNode e = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;

		new DeleteDuplicates().deleteDuplicates(a);
	}
}
