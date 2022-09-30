package src.TableAssignment;

/**
 * Direct-Address Table
 * @author jonah
 */
public class DaTable {
	public Data[] table = new Data[(int) Math.pow(2,16)];
	
	/**
	 * Searches for the value at key k in the table
	 * @param k The key to search at
	 * @return The value at the given key, assuming such a value exists, otherwise null
	 */
	public Data search(int k) {
		return table[k];
	}
	
	/**
	 * Inserts instance of class Data at key contained in said instance
	 * @param x Instance of Data class to be inserted
	 */
	public void insert(Data x) {
		table[x.getKey()] = x;
	}
	
	/**
	 * Deletes data value x from table
	 * @param x Data value to delete
	 */
	public void delete(Data x) {
		if(table[x.getKey()] == x) { // There may be a different value at x's key
			table[x.getKey()] = null;
		}
	}
	
}
