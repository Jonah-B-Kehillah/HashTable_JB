package src.TableAssignment;

public class TableTester {
	
	private static int tests = 0;
	private static int passed = 0;
	private static int failed = 0;
	
	public static void main(String[] args) {
	
	}
	
	
	
	private static void test(boolean output, String method) {
		tests++;
		System.out.println(String.format(
			"Test #%d %s (%s)",
			tests,
			(output ? "passed" : "failed"),
			method
		));
	}
	
}
