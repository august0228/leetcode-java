/**
 *
 * @author sun. on 11/1/2019.
 */
public class Assert {
	public static void assertIsTrue(boolean expression) {
		if (!expression) {
			throw new RuntimeException("执行错误");
		}
	}
}
