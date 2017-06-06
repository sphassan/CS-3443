import java.io.*;
import java.util.Scanner;

/**
 * FileCounts calculates the number of lines, tokens, characters, and bytes in a file.
 * 
 * @author Sean
 */

public class FileCounts {
	/**
	 * The file
	 */
    private File file;
    
    /**
     * Creates the FileCounts object, passes the selected file to the file variable.
     * 
     * @param file
     */
    public FileCounts(File file) {
        this.file = file;
    }
    
    /**
     * Counts and returns the number of lines in the file.
     * 
     * @return
     * @throws FileNotFoundException
     */
    public int lineCount() throws FileNotFoundException {
    	Scanner in = new Scanner(file);
    	int cnt = 0;
    	while (in.hasNextLine())
    	{
    		in.nextLine();
    		cnt++;
    	}
    	in.close();
        return cnt;
    }
    
    /**
     * Counts and returns the number of tokens in the file
     * 
     * @return
     * @throws FileNotFoundException
     */
    public int tokenCount() throws FileNotFoundException {
    	Scanner in = new Scanner(file);
    	int cnt = 0;
    	while (in.hasNext())
    	{
    		in.next();
    		cnt++;
    	}
    	in.close();
        return cnt;
    }
    
    /**
     * Counts and returns the number of chars in the file
     * 
     * @return
     * @throws IOException
     */
    public int charCount() throws IOException {
    	BufferedReader in = new BufferedReader(new FileReader(file));
    	int cnt = 0;
    	while (in.read() != -1)
    		cnt++;
    	in.close();
        return cnt;
    }
    
    /**
     * Counts and returns the number of bytes in the file 
     * 
     * @return
     * @throws IOException
     */
    public int byteCount() throws IOException {
    	BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
    	int cnt = 0;
    	while (in.read() != -1)
    		cnt++;
    	in.close();
        return cnt;
    }
}