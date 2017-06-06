/**
 * A DuaHashlMap maintains a one-to-one mapping between keys and value. A DualHashMap
 * object should contain a HashMap from keys to values and a HashMap from values to
 * keys. A DualHashMap cannot contain duplicate keys or duplicate values.
 * 
 * @author Sean Hassan
 */

import java.util.HashMap;

public class DualHashMap<K, V> implements DualMap<K, V>
{
	/**
	 * The Hash Map with a one-to-one mapping between keys and values.
	 */
	private HashMap<K, V> map;
	/**
	 * The Hash Map with a one-to-one mapping between values and keys.
	 */
	private HashMap<V, K> reversemap;
	
	/**
	 * Creates the DualHashMap object, instantiates the hash maps.
	 */
	public DualHashMap()
	{
		map = new HashMap<K, V>();
		reversemap = new HashMap<V, K>();
	}

    /**
     * Associates the specified value with the specified key in this dual hash map.
     * After dualhashmap.put(key, value) is performed, then dualhashmap.get(key) should
     * return value and dualhashmap.reverseGet(value) should return key.
     * <p>
     * If the dual hash map previously contained a mapping for the key or the value,
     * the old association(s) should be removed.
     * 
     * @param key
     *            key to be associated with the specified value.
     * @param value
     *            value to be associated with the specified key
     */
	@Override
	public void put(K key, V value)
	{
		if (get(key) != null && reverseGet(value) != null && get(key).equals(reverseGet(value)))
		{
			map.remove(get(key));
			reversemap.remove(reverseGet(value));
		}
		map.put(key, value);
		reversemap.put(value, key);
	}

	/**
     * Removes the mapping from the key to the value from this dual hash map if it is
     * present. After dualhashmap.put(key, value) and dualhashmap.remove(key, value),
     * then dualhashmap.get(key) should return null and dualhashmap.reverseGet(value)
     * should return null.
     * 
     * @param key
     *            key whose mapping to value is to be removed
     * @param value
     *            value whose mapping from key is to be removed
     */
	@Override
	public void remove(K key, V value)
	{
		map.remove(key, value);
		reversemap.remove(value, key);
	}

	/**
     * Returns the value that maps from the specified key, or null if this dual
     * hash map contains no mapping for the key.
     * 
     * @param key
     *            the key that maps to the value that should be returned
     * @return the value that maps from the specified key, or null if this dual
     *         hash map contains no mapping for the key
     */
	@Override
	public V get(K key)
	{
		return map.get(key);
	}

	/**
     * Returns the key that maps to the specified value, or null if this dual
     * hash map contains no mapping for the value.
     * 
     * @param value
     *            the value that maps from the key that should be returned
     * @return the key that maps to the specified value, or null if this dual
     *         hash map contains no mapping for the value
     */
	@Override
	public K reverseGet(V value)
	{
		return reversemap.get(value);
	}
}