
package lab8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Lab8 {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(101876, "Samar");
        hm.put(233563, "Ahlam");
        hm.put(789728, "Lama");
        System.out.println("Created hashmap is");
        System.out.println(hm);
        hm.put(789728, "Ahmed");
        System.out.println("The Hashmap afer changing the third element's value is");
        System.out.println(hm);
        hm.remove(233563);
        System.out.println("The Hashmap afer removing the  value with key 233563");
        System.out.println(hm);
        System.out.println("Printing using Iterator");

        Iterator<Map.Entry<Integer, String>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }

}
 
