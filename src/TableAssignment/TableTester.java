package src.TableAssignment;

import java.util.Objects;

public class TableTester {
	
	private static int tests = 0;
	private static int passed = 0;
	private static int failed = 0;
	
	public static void main(String[] args) {
		System.out.println("Direct Address Table Tests");
		test(testInsert1(), "Data.insert()");
		test(testInsert2(), "Data.insert()");
		test(testDelete1(), "Data.delete()");
		test(testDelete2(), "Data.delete()");
		test(testSearch1(), "Data.search()");
		test(testSearch2(), "Data.search()");
		
//		System.out.println("\nHash Table Tests");
//		tests = 0;
		
		
		System.out.println(String.format("\nTests passed: %d, Tests failed: %d", passed, failed));
	}
	
	// Direct Address Table Tests
	private static boolean testInsert1() {
		DaTable table = new DaTable();
		table.insert(new Data(1,1));
		table.insert(new Data(2,2));
		table.insert(new Data(3,3));
		return table.table[1].equals(1) && table.table[2].equals(2) && table.table[3].equals(3);
	}
	private static boolean testInsert2() {
		DaTable table = new DaTable();
		table.insert(new Data<Integer>(1,1));
		table.insert(new Data(2,2));
		table.insert(new Data(3,2));
		return table.table[1].equals(1) && table.table[2].equals(3);
	}
	private static boolean testDelete1(){
		DaTable table = new DaTable();
		table.insert(new Data(1,1));
		Data datum = new Data<Integer>(2,2);
		table.insert(datum);
		table.delete(datum);
		return table.table[2] == null;
	}
	private static boolean testDelete2(){
		DaTable table = new DaTable();
		table.insert(new Data(1,1));
		table.insert(new Data(2,2));
		table.delete(new Data(12.097f, 2));
		return Objects.equals(table.table[2], new Data(2, 2));
	}
	private static boolean testSearch1() {
		DaTable table = new DaTable();
		Data<Float> datum = new Data(12.907, 7);
		table.insert(datum);
		return table.table[7].equals(datum);
	}private static boolean testSearch2() {
		DaTable table = new DaTable();
		Data<Float> datum = new Data(12.907, 7);
		table.insert(datum);
		table.insert(new Data(0x72c9,7));
		return !table.table[7].equals(datum);
	}
	
	// Hash Table Tests
	
	
	/**
	 * A function for unit testing
	 * @param output The method to be testing
	 * @param method The name of the tested method, for logging purposes
	 */
	public static void test(boolean output, String method) {
		tests++;
		if(output) passed++; else failed++;
		System.out.println(String.format(
			"Test #%d %s (%s)",
			tests,
			(output ? "passed" : "failed"),
			method
		));
	}
	
}
