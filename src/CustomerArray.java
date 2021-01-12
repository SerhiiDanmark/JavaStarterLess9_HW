public class CustomerArray {

    public static void main(String[] args) {

        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 10) -5);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int valueMax = arr[0];
        int valueMin = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > valueMax) {
                valueMax = arr[i];
            }
            if (arr[i] < valueMin) {
                valueMin = arr[i];
            }
        }
        System.out.println("\nМаксимальне значення масиву = " + valueMax + "\nМінімальне значення масиву = " + valueMin);

        int sumNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            sumNumber += arr[i];
        }
        System.out.println("\nСума чисел масиву = " + sumNumber);

        int arithmetic = 0;

        for (int i = 0; i < arr.length; i++) {
            arithmetic += arr[i];
        }
        arithmetic /= arr.length;
        System.out.println("Середнє арифметичне значення чисел масиву = " + arithmetic);

        System.out.print("Всі непарні числа, які знаходяться в масиві: ");
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
