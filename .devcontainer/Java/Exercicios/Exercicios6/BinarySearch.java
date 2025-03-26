package Exercicios6;

public class BinarySearch {
    public static boolean binarySearch(int[] list, int item) {
        int first = 0;
        int midpoint = 0;
        int last = list.length - 1;
        boolean found = false;

        while(first <= last && !found) {
            midpoint = (first + last) / 2;

            if(list[midpoint] == item){
                found = true;
            }
            else {
                if(item < list[midpoint]){
                   last = midpoint - 1;
                }
                else {
                    first = midpoint + 1;
                }


            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[] testlist = {0, 3, 5, 9, 14, 17, 21, 33, 39};
        System.out.println(binarySearch(testlist, 15));  
        System.out.println(binarySearch(testlist, 39));
    }
}
