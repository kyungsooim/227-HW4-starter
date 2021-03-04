/**
 * Write your comments here
 */
import java.util.*;

public class Anagrams {
    private List<String> orderedDictionary;
    private Map<String, LetterInventory> inventoryMap;

    /**
     * Constructor
     * @param dictionary
     */
    public Anagrams(List<String> dictionary) {
        orderedDictionary = new LinkedList<>(dictionary);
        inventoryMap = new HashMap<>();
        for(String s : dictionary) {
            inventoryMap.put(s, new LetterInventory(s));
            // should only happen once in the constructor
            //Thus using map is required
        }
    }

    /**
     * prints all possible answers of anagram with given max
     * @param text
     * @param max
     */
    public void print(String text, int max) {
        //TODO
    }


}