package CollectionsHW;

import java.util.HashMap;
import java.util.Map;

public class HashTreeMap {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
        dictionary.put("Brilliant", "exceptionally clever or talented.");
        dictionary.put("Joy", "a feeling of great pleasure and happiness.");
        dictionary.put("Confidence", "the state of feeling certain about the truth or something.");

//        for(String word : dictionary.keySet()){
//            System.out.println(dictionary.get(word));
//        }

        for(Map.Entry<String, String> entry: dictionary.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
