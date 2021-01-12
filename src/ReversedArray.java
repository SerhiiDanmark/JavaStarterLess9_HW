public class ReversedArray {

    static int[] myReverse (int[] array) {

        int[] values = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                values[j] = array[i];
        }
        return values;
    }

    static int[] subArray (int[] array, int index, int count) {
        int[] values = new int[count];
        boolean full = false;
        for (int i = index, j = 0; i < count; i++, j++) {
            if (i <= ((array.length - index) + 1) && !full) {
                values[j] = array[i];
            } else {
                if (!full) {
                    full = true;
                    i -= index;
                }
                values[j] = 1;
            }
        }
        return values;
    }

    public static void main(String[] args) {
        int[] values;
        int[] values2;

        values = myReverse (new int[] {1, 3, 5, 7, 9});
        values2 = subArray (new int[] {1, 3, 5, 7, 9, 11, 15}, 2, 8);

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < values2.length; i++) {
            System.out.print(values2[i] + " ");
        }
        System.out.println();
    }
}