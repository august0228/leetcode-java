import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长子串
 *
 * 输入: "abcabcbb"
 * 输出: 3
 *
 * @author sun. on 11/1/2019.
 */
public class LengthOfLongestSubstring {

	public int lengthOfLongestSubstring(String s) {

		Map<Character, Integer> map = new HashMap<>();
		int ans = 0, l = 0;
		for (int j = 0; j < s.length(); j++) {
			if (map.containsKey(s.charAt(j))) {
				l = Math.max(map.get(s.charAt(j)), l);
			}
			ans = Math.max(ans, j - l + 1);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}

	public static void main(String[] args) {
		String a = "abcabcbb";
		Assert.assertIsTrue(new LengthOfLongestSubstring().lengthOfLongestSubstring(a) == 3);
	}

}





