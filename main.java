class Search {
    public void find(int[] array, int element) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("Element " + element + " found at index " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Element " + element + " not found in the array.");
        }
    }

    public void freq(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            if (array[i] == -1) {
                continue; // Skip elements already counted
            }
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    array[j] = -1; // Mark the element as counted
                }
            }
            System.out.println("Element " + array[i] + " appears " + count + " times.");
        }
    }
}

public class main {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 2, 4, 3, 2, 1, 4, 2};

        Search search = new Search();

        search.find(array, 3);  // Search for element 3 in the array

        System.out.println();

        search.freq(array);  // Find the frequency of every element in the array
    }
}
