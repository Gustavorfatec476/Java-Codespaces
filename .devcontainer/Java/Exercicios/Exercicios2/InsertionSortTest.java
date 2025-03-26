public class InsertionSortTest {

    /**
     * Implementação do Insertion Sort em Java.
     *
     * @param arr array de inteiros a ser ordenado
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move os elementos arr[j] que são maiores que key para
            // uma posição à frente da sua posição atual.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    /**
     * Gera um array invertida de 0 até size-1.
     *
     * @param size Tamanho do array
     * @return array de inteiros
     */

    public static int[] generateInvertedArray (int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i;
        }
        return arr;
    }
    /**
     * Gera um array já ordenado (crescente) de 0 até size-1.
     *
     * @param size Tamanho do array
     * @return array ordenado de inteiros
     */
    public static int[] generateSortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;  // ou outra sequência crescente
        }
        return arr;
    }

    /**
     * Mede o tempo de execução de uma função de ordenação.
     *
     * @param arr o array a ordenar
     * @return tempo em nanosegundos
     */
    public static long measureInsertionSortTime(int[] arr) {
        long start = System.nanoTime();
        insertionSort(arr);
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        // Tamanhos solicitados
        int[] sizes = {10, 100, 500, 1000, 2000, 5000};

        System.out.printf("%-10s %-20s %-20s\n", "N", "Ordenado(ns)", "Invertido(ns)");
        for (int n : sizes) {
            // Gera array ordenado
            int[] sortedArray = generateSortedArray(n);
            // Gera array aleatório (desordenado)
            int[] invertedArray = generateInvertedArray(n);

            // Mede tempo para o array ordenado
            long timeSorted = measureInsertionSortTime(sortedArray);

            // Mede tempo para o array aleatório
            long timeInverted = measureInsertionSortTime(invertedArray);

            System.out.printf("%-10d %-20d %-20d\n", n, timeSorted, timeInverted);
        }
    }
}