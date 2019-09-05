package string;

import java.util.Objects;

/**
 *编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author sun. on 9/5/2019.
 */
public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		/******************************************************
		 * 取第一个和第二个的公共前缀，再用结果拿到与第三个的公共前缀
		 *  如 "flower", "flow", "flight"
		 *   flower 和 flow 的公共前缀是 flow flow 和 flight 的公共前缀是 fl
		 ******************************************************/
		String result = strs[0];
		for (int i = 1; i < strs.length; i++) {
			String t = strs[i];

			for (int j = 0; j < result.length(); j++) {
				if (j >= t.length() || result.charAt(j) != t.charAt(j)) {
					result = result.substring(0, j);
					break;
				}
			}

		}
		return result;
	}

	public static void main(String[] args) {
		String[] input = {"flower", "flow", "flight"};
		System.out.println(new LongestCommonPrefix().longestCommonPrefix(input));
	}

}
