package com.core.nk.advJava.HashMap;

import java.util.*;

public class HashMapTest {
   public static void main(String[] args) {
      Map<String, String> hashMap = new HashMap<>();
      hashMap.put("CA", "California");
      hashMap.put("NY", "NewYork");
      hashMap.put("DE", "Delaware");

      System.out.println(hashMap.get("CA") + ": Single Extraction");

      // Create sets of keys and entries.
      Set<String> keys = hashMap.keySet();
      Collection<String> values = hashMap.values();
      Iterator<String> keyIterator = keys.iterator();
      System.out.println("Keys:");
      while(keyIterator.hasNext()) {
         String s = keyIterator.next();
         System.out.println(s);
      };
      Iterator<String> valueIterator = values.iterator();
      System.out.println("\n\nValues:");
      while(valueIterator.hasNext()) {
         String item = valueIterator.next();
         System.out.println(item);
      };
   }
}
