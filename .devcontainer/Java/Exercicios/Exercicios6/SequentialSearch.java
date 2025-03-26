package Exercicios6;

public class SequentialSearch {
    public static boolean sequentialSearch(int[] list, int item) {
        int pos = 0;
        boolean found = false;

        while (pos < list.length && !found) {
            if(list[pos] == item){
                found = true;
            }
            else {
                pos = pos + 1;
            }
        }

        return found;
    }

    public static void main(String[] args) {
        int[] testlist = {0, 3, 5, 9, 14, 17, 21, 33, 39};

        System.out.println(sequentialSearch(testlist, 15));  
        System.out.println(sequentialSearch(testlist, 39));
    }
}
