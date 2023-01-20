package com.techreturners.exercise003;

import java.util.*;

public class Exercise003 {
    private static Map<String, Integer> fMap;

    static {
        Exercise003.initMap();
    }
    private static void initMap() {
        fMap = new LinkedHashMap<String, Integer>();
        fMap.put("Pistachio", 0);
        fMap.put("Raspberry Ripple", 1);
        fMap.put("Vanilla", 2);
        fMap.put("Mint Chocolate Chip", 3);
        fMap.put("Chocolate", 4);
        fMap.put("Mango Sorbet", 5);
    }

    int getIceCreamCode(String iceCreamFlavour) {
        Integer code = fMap.get(iceCreamFlavour);

        int value = -1;
        if(code != null){
            value = code.intValue();
        }
        return value;
    }

    String[] iceCreamFlavours() {
      String[] flavours = new String[fMap.size()];
      int i = 0;

      Iterator<Map.Entry<String, Integer>> it = fMap.entrySet().iterator();
      while(it.hasNext()) {
          flavours[i] = it.next().getKey();
          i++;
      }
      return flavours;
    }

}
