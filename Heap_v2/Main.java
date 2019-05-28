import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        int n = 1;
        HashMap<String,Integer> HashURL = new HashMap<String, Integer>();
        while (n <= 8) {
            BufferedReader readTxt = new BufferedReader(new FileReader(new File(System.getProperty("user.dir") + "/" + n + ".txt")));

            String textLine = "";

            String str = "";

            while ((textLine = readTxt.readLine()) != null) {
                str += " " + textLine;
            }

            String[] numbersArray = str.split(" ");

            Integer i = 1;

            while (i < numbersArray.length) {
                String URL = numbersArray[i];
                if (HashURL.containsKey(URL) == false) {
                    HashURL.put(URL, 1);
                } else {
                    Integer count = HashURL.get(URL);
                    //System.out.println(count + URL + " " + i);
                    count = count + 1;
                    HashURL.put(URL, count);
                    //System.out.println(count);
                }
                i = i + 1;
            }
            n = n + 1;
            readTxt.close();
        }
        
        Set<String> keys = HashURL.keySet();
        /*
        for (String key : keys) {
            System.out.println(key + " " + HashURL.get(key));
        }
        */

        
        int size = 4;
        Heap heap = new Heap();

        Heap Node = new Heap();
        Heap.Node[] data = new Heap.Node[size];

        // Initialization
        for (int i = 0; i < size; i++) {
            data[i] = Node.new Node();
        }

        for (int i = 0; i < size; i++) {
            data[i].setNumber(0);
            data[i].setUrl("");
        }
        // Construct the Heap
        heap.buildHeapWithArray(data, size);

        for (String key : keys) {
            int num;
            num = HashURL.get(key);
            // System.out.println(num);
            int minEle = heap.getMin();
            // System.out.println(minEle);
            if (num > minEle) {
                heap.deleteMin();
                heap.insert(num, key);
                // System.out.println("After insert, min = " + heap.getMin());
            }
        }
        // System.out.println(Arrays.toString(data));
        System.out.println("Top " + size + " URL: ");
        for(int i = 0; i < size; i++) {
            System.out.println("count: " + data[i].count + " " + "url: " + data[i].url);
        }
    }
}
