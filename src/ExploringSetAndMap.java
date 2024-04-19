import java.util.*;
import java.io.*;

/**
 * This class demos how to create Sets and Maps
 */
public class ExploringSetAndMap {

    public static void main(String[] args) {
        // exploringSet();
       exploringMap();

       // exploringSet("data/speech.txt");
        //exploringMap("data/speech.txt");
    }

    /**
     * This method uses a native array to populate an ArrayList and
     * and a TreeSet
     * Sets have no indices and no duplicates
     */
    public static void exploringSet() {
        int[] data = {18, 4, 97, 3, 4, 18, 72, 4, 42, 42, -3};

        List<Integer> numbers1 = new ArrayList<>();
        Set<Integer> numbers2 = new HashSet<>(); // TreeSet allows for sorted values - fast
        // HashSet will not sort values - generally faster
        ListSet numbers3 = new ListSet();

        // TODO: comment what does this loop do?
        for (int n : data) {
            numbers1.add(n);
            numbers2.add(n);
            numbers3.add(n);
        }

        // TODO: comment what makes set different
        System.out.println("numbers1 = " + numbers1);
        System.out.println("numbers2 = " + numbers2);
        System.out.println("numbers3 = " + numbers3);

        // TODO: comment is the loop below allowable when working with a Set
//         for (int i = 0; i < numbers2.size(); i++) {
//             System.out.print(numbers2.get(i));
//         }

        // TODO: comment what does the loop below do
//        for(int num : numbers3){
//            System.out.print(num + " ");
//        }

    }

    /**
     * This method creates a map where the keys are superhero names and the values are the
     * regular character names
     */
    public static void exploringMap() {

        Map<String, String> heros = new HashMap<>();
        heros.put("Batman", "Bruce Wayne");
        heros.put("Spiderman", "Peter Parker");
        heros.put("Catwoman", "Selina Kyle");
        heros.put("Ironman", "Tony Stark");
        heros.put("Superman", "Clark Kent");
        heros.put("Hulk", "Bruce Banner");
        // TODO: comment what happens when we put the same key
        // heros.put("Batman", "Terry McGinnnis");

        // TODO: comment what the map toString() does
        System.out.println("Heros = " + heros +"\n");

        // TODO: comment what this loop does
        for (String heroName : heros.keySet()) {
            System.out.println(heroName + " becomes " + heros.get(heroName) + " in everyday life.");
        }

        System.out.println();

        // TODO: comment what this loop does
        for (Map.Entry<String, String> entry : heros.entrySet()) {
            System.out.println(entry.getKey() + " becomes " + entry.getValue() + " in everyday life.");
        }
    }

    /**
     * This method reads in text from a data file
     * and populates a TreeSet with all the unique words
     * in the file
     *
     * @param fileName - text file to be read
     */
    public static void exploringSet(String fileName) {

        try (Scanner input = new Scanner(new File(fileName))) {

            Set<String> words = new TreeSet<>();

            // TODO: comment what does this loop do?
            while (input.hasNext()) {
                String next = input.next().toLowerCase();
                // TODO: comment what does adding to a set do?
                words.add(next);
            }

            System.out.println("Set of words = " + words);
            System.out.println("Total unique words = " + words.size());

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    /**
     * This method reads in text from a data file and produces a map of how
     * many times each word appeared in the file
     * Key: word  Value: word count
     *
     * @param fileName - text file to be read
     */
    public static void exploringMap(String fileName) {

        try (Scanner input = new Scanner(new File(fileName))) {
            Map<String, Integer> words = new TreeMap<>();

            // TODO: comment what does this loop do?
            while (input.hasNext()) {
                String next = input.next().toLowerCase();
                // TODO: what are we checking for here?
                if (!words.containsKey(next)) {
                    // TODO: what does this do?
                    words.put(next, 1);
                } else {
                    // TODO: what do these next two lines do?
                    int currentCount = words.get(next);
                    words.put(next, currentCount + 1);
                }
            }

            System.out.println("List of words = " + words);
            System.out.println("Total unique words = " + words.size());

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }


}