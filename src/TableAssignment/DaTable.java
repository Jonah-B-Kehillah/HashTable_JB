package src.TableAssignment;

import javax.xml.crypto.dsig.keyinfo.KeyName;
import java.security.KeyException;
import java.time.temporal.ValueRange;

/**
 * Direct-Address Table
 * @author jonah
 * @param <T> The class of object to be stored in the table
 */
public class DaTable<T> {
	private T[] data = (T[]) new Object[(int) Math.pow(2,16)];
	
	/**
	 * Returns the value at
	 * @param k Key to get value from
	 * @return The value at given key, assuming a value exists there
	 * @throws KeyException if no value is present at the given key
	 */
	public T search(int k) throws KeyException {}
	
	/**
	 *
	 * @param k
	 * @param value
	 * @param ow
	 * @throws IllegalAccessError
	 */
	public void insert(int k, T value, boolean ow) throws IllegalAccessError {
	
	}
	public void insert(int k, T value) throws IllegalAccessError {this.insert(k,value);}
	
}
