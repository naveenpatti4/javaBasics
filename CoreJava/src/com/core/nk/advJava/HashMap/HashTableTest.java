package com.core.nk.advJava.HashMap;

import java.util.*;

public class HashTableTest {
   public static void main(String[] args) {
      Map<String, String> myTable = new Hashtable<String, String>();
      myTable.put("CA", "California");
      myTable.put("NY", "NewYork");
      myTable.put("DE", "Delaware");

      System.out.println(myTable.get("CA") + ": Single Extraction");

      // Create sets of keys and entries.
      Set<String> keys = myTable.keySet();
      Collection<String> values = myTable.values();
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
