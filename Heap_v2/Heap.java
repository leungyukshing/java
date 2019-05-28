import java.util.Arrays;


public class Heap {

    public class Node {
        public int count;
        public String url;

        public void setNumber(int number) {
            this.count = number;
        }

        public void setUrl(String url) {
            this.url = url;
        }



    }
    private void print() {
      for (int i = 0; i < array.length; i++) {
          System.out.print(array[i].count + " ");
      }
      System.out.println();
    }

    Node[] array;
    int size;

    public void buildHeapWithArray(Node[] array, int size) {
        if (size > array.length)
            throw new RuntimeException("元素个数超过数组大小");

        this.array = array;

        // look array
        // print()

        this.size = size;
        for (int i = size / 2 - 1; i >= 0; i--)
            percolateDown(i);
    }

    public int deleteMin() {
        if (size == 0)
            throw new RuntimeException("No element in heap, CANNOT delete");

        // System.out.println("Before delete: " + size);
        // look array
        // print();

        int minItem = array[0].count;
        // System.out.println("size1: " + size);
        array[0].count = array[--size].count;
        array[0].url = array[size].url;
        // print();

        // System.out.println("size2: " + size);
        array[size].count = -1;

        // System.out.println("Before percolate: ");
        // look array
        // print();

        percolateDown(0);


        // System.out.println("After percolate: ");
        // look array
        // print();

        return minItem;
    }

    public void insert(int x, String xx) {
        if (size == array.length)
            throw new RuntimeException("Array is full, CANNOT insert");
        int hole = size++;
        // System.out.println("Insert " + x + ", URL = " + xx);
        for (; hole != 0; hole = (hole - 1) / 2) {
            if (x < array[(hole - 1) / 2].count && xx != array[(hole - 1) / 2].url) {
              //array[hole] = array[(hole - 1) / 2];
              array[hole].count = array[(hole - 1) / 2].count;
              array[hole].url = array[(hole - 1) / 2].url;
            }
            else
                break;
        }
        array[hole].count = x;
        array[hole].url = xx;

        // look array
        // System.out.println("After insert: ");
        // print();
    }

    public int getMin() {
        return array[0].count;
    }

    private void percolateDown(int hole) {
        int tmp = array[hole].count;
        String emp = array[hole].url;
        int childIndex;

        for (; hole * 2 <= size - 2; hole = childIndex) {
            childIndex = hole * 2 + 1;
            if (childIndex != size - 1 && array[childIndex + 1].count < array[childIndex].count && array[childIndex + 1].url != array[childIndex].url)
                childIndex++;

            if (tmp > array[childIndex].count && emp != array[childIndex].url) {
                array[hole].count = array[childIndex].count;
                array[hole].url = array[childIndex].url;
            }
            else
                break;
        }
        array[hole].count = tmp;
        array[hole].url = emp;
    }
}
