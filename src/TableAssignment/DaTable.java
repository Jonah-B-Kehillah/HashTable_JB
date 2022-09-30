package src.TableAssignment;

/**
 * Direct-Adress Table
 * @author jonah
 * @param <T> The class of object to be stored in the table
 */
public class DaTable<T> {
	private T[] data = T[(int) Math.pow(2,16)];
}
