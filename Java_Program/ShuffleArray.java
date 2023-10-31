public class ShuffleArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(myArray);

        // Print the shuffled array
        for (int value : myArray) {
            System.out.print(value + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;

        // Iterate from the end to the beginning
        for (int i = n - 1; i > 0; i--) {
            // Generate a random-like index without using inbuilt methods
            int j = (i * 31) % (i + 1);

            // Swap elements at indices i and j without inbuilt methods
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
