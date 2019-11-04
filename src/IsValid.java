import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. 有效的括号
 *
 * @author sun. on 10/29/2019.
 */
public class IsValid {

	public boolean isValid(String s) {

		Map<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if (stack.size() == 0 || !stack.peek().equals(map.get(s.charAt(i)))) {
					return false;
				} else {
					stack.pop();
				}
			} else {
				stack.push(s.charAt(i));
			}
		}
		return stack.size() == 0;
	}

	public static void main(String[] args) {
		String test1 = "(]";
		String test2 = "([])";
		String test3 = "([)]";
		String test4 = "{[]}";
		new IsValid().isValid("[");
		Assert.assertIsTrue(!new IsValid().isValid(test1));
		Assert.assertIsTrue(new IsValid().isValid(test2));
		Assert.assertIsTrue(!new IsValid().isValid(test3));
		Assert.assertIsTrue(new IsValid().isValid(test4));
	}
}
