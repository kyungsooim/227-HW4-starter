/**
 * Write your comments here
 */
public class LetterInventory {

    private static final int ALPHABET_LENGTH = 26;

    private int[] counters;
    int totalCount;

    /**
     * Initializes the fields in the LetterInventory to empty values.
     */
    public LetterInventory() {
        /* Allocate space for the array */
        counters = new int[ALPHABET_LENGTH];
        /* Iterate over array with ForEach loop to assign 0's */
        for(int i:counters) {
            i = 0;
        }
        totalCount = 0;
    }

    /**
     * comment
     */
    public LetterInventory(String input) {
        /* Setup array */
        this();
        /* Iterate over the input String to allocate the appropriate counters */
        //TODO
    }

    /**
     * comment
     */
    public int get(char c) {
        //TODO
        return 0;
    }

    /**
     * comment
     */
    public void set(char c, int count) {
        //TODO
    }

    /**
     * comment
     */
    public int size() {
        return totalCount;
    }

    /**
     * comment
     */
    public boolean isEmpty() {
        return totalCount == 0;
    }

    public String toString() {
        String buffer = "[";
        for(int i = 0; i < ALPHABET_LENGTH; i++) {
            for(int j = 0; j < counters[i]; j++) {
                buffer += (char)('a' + i);
            }
        }
        return buffer + ']';
    }

    /**
     * comment
     */
    public LetterInventory add(LetterInventory other) {
        //TODO
        return new LetterInventory();
    }

    /**
     * comment
     */
    public LetterInventory subtract(LetterInventory other) {
        //TODO
        return new LetterInventory();
    }

    /**
     * comment
     */
    public double getLetterPercentage(char c) {
        //TODO
        return 0;
    }

    /**
     * comment
     */
    private int getIndex(char c) {
        //TODO
        return 0;
    }
}
