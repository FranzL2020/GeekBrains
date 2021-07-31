import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        changeNumber();
        addNumber();
        MultiArrayMoreSix();
        do2DMassiv();
        searchMinMaxNumberInArray();

    }


    /**
     * Task1
     */
    public static void changeNumber() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] > 0) ? 0 : 1;
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * Task2
     */
    public static void addNumber() {
        int[] number = new int[100];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }
        System.out.println(Arrays.toString(number));
    }

    /**
     * Task3
     */

    public static void MultiArrayMoreSix() {
        int[] changearr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < changearr.length; i++) {
            int Dotwo = changearr[i];
            changearr[i] = Dotwo < 6 ? Dotwo * 2 : Dotwo;

        }

        System.out.println(Arrays.toString(changearr));
    }

    /**
     * Task4
     */

    public static void do2DMassiv() {
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
                if (arr[i] == arr[j]) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                for (int p = 6; p > 1; p--) {

                    if (arr[p] == arr[j]) {
                        arr[p][j] = 1;
                    } else {
                        arr[p][j] = 0;
                    }
                    System.out.print(arr[p][j] + " ");

                }
                System.out.println();
            }
        }
    }
    /**
     *   Task5
     */


    static int [] Array (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }




    /**
     * Task6
     */

    static void searchMinMaxNumberInArray() {

        int[] array = {8, 343, 26, 434, 22, 4, 49, 7879, 433, 9};

        int minValue = array[0];

        for (int i = 0; i != array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];

                int maxValue = array[0];

                for (i = 0; i != array.length; i++) {
                    if (maxValue < array[i]) {
                        maxValue = array[i];


                    }


                }
                System.out.println("Минимальный  элемент массива" + " " + minValue);
                System.out.println("Минимальный  элемент массива" + " " + maxValue);

            }


        }
    }



}





























