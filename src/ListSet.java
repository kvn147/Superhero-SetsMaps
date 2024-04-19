import java.util.*;

public class ListSet {
   private ArrayList<Integer> data;  
   
   public ListSet() {
      data = new ArrayList<>();
   }

   public boolean add(int val) {
      // if val is not in the set
      if (!contains(val)) {
         // add it to the set(arrayList)
         return data.add(val);
      }
      return false;
   }
   
   public boolean contains(int val) {
      return data.contains(val);
   }
   
   public int remove(int val) {
      return data.remove(val);
   }
   
   public void clear() {
      data.clear();
   }
   
   public int size() {
      return data.size();
   }
   
   public boolean isEmpty() {
      return data.isEmpty();
   }
   
   public String toString() {
      return data.toString();
   }
   
}