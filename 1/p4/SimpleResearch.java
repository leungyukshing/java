import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class SimpleResearch {
  public static void main(String[] args) {
    while (true) {
      Scanner input = new Scanner(System.in);
      int n, m;
      n = input.nextInt();
      m = input.nextInt();
      if (n == 0 && m == 0) {
        return;
      }

      /*读取矩阵*/
      char [][]matrix = new char[n][m];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          matrix[i][j] = input.next().charAt(0);
        }
      }

      /*统计*/
      Map<String, Integer> map = new HashMap<String, Integer>();
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          switch (matrix[i][j]) {
            case 'A': {
              Integer freq = map.get("A");
              map.put("A", freq == null ? 1 : freq + 1);
              break;
            }
            case 'C': {
              Integer freq = map.get("C");
              map.put("C", freq == null ? 1 : freq + 1);
              break;
            }
            case 'D': {
              Integer freq = map.get("D");
              map.put("D", freq == null ? 1 : freq + 1);
              break;
            }
            case 'E': {
              Integer freq = map.get("E");
              map.put("E", freq == null ? 1 : freq + 1);
              break;
            }
            case 'G': {
              Integer freq = map.get("G");
              map.put("G", freq == null ? 1 : freq + 1);
              break;
            }
            default:
              System.out.print("Wrong input");
              return;
          }
        }
      }

      /*打印*/
      List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
            //升序排序
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
            
        });
        
        for(Map.Entry<String,Integer> mapping:list){ 
               System.out.println(mapping.getKey()+":"+mapping.getValue()); 
          } 
    }
  }  
}