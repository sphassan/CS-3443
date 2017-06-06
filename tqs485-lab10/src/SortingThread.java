import java.util.Arrays;

/**
 * This class synchronizes the threads and as is as portable as SortingBuffer is
 * 
 * @author Sean Hassan
 */
public class SortingThread implements Runnable
{
	/**
	 * The thread number
	 */
	int threadnum;
	/**
	 * The array of numbers
	 */
	int[] array;
	/**
	 * The SortingBuffer object
	 */
	SortingBuffer buffer;
	
	/**
	 * Initializes threadnum, the array, and the SortingBuffer.
	 * Also sorts the array.
	 * 
	 * @param i
	 * @param array0
	 * @param buffer
	 */
	public SortingThread(int i, int[] array0, SortingBuffer buffer)
	{
		threadnum = i;
		array = array0;
		Arrays.sort(array);
		this.buffer = buffer;
	}

	/**
	 * Atomically prints out all members of the thread's array
	 * before synchronizing thread output.
	 */
	@Override
	public void run()
	{
		synchronized (SortingThread.class)
		{
			for (int x = 0; x < array.length; x++)
				System.out.println(threadnum + " unsynchronized " + array[x]);
		}
		
		for (int x = 0; x < array.length; x++)
		{
			try {
				buffer.waitUntilMinimum(threadnum, array[x]);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(threadnum + " synchronized " + array[x]);
		}
		
		buffer.finished(threadnum);
	}
}
