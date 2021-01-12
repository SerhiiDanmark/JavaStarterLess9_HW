public class UserArray {

    static int[] addvalue(int[] array, int value) {
        int[] values = new int[array.length + 1];
        for (int i = 0; i < values.length; i++) {
            if (i == 0) {
                values[i] = value;
                continue;
            }
            values[i] = array[i - 1];
            }
        return values;
    }

    public static void main(String[] args) {
        int[] array = addvalue(new int[]{1, 3, 5, 7}, 5);

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
