package linked_list;

/**
 *给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author sun. on 10/11/2019.
 */
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode root = new ListNode(0);
		ListNode cursor = root;
		int flag = 0;
		while (l1 != null || l2 != null || flag != 0) {
			int var1 = l1 != null ? l1.val : 0;
			int var2 = l2 != null ? l2.val : 0;

			int sum = var1 + var2 + flag;

			flag = sum / 10;
			ListNode node = new ListNode(sum % 10);

			cursor.next = node;
			cursor = node;
			l1 = l1 != null ? l1.next : null;
			l2 = l2 != null ? l2.next : null;
		}
		return root.next;
	}

	public static void main(String[] args) {
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(4);
		ListNode c = new ListNode(3);
		a.next = b;
		b.next = c;

		ListNode a2 = new ListNode(5);
		ListNode b2 = new ListNode(6);
		ListNode c2 = new ListNode(4);
		a2.next = b2;
		b2.next = c2;

		ListNode listNode = new AddTwoNumbers().addTwoNumbers(a, a2);
	}
}
