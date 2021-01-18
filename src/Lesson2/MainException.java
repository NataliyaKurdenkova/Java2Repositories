package Lesson2;

import java.util.Arrays;

public class MainException {
    public static void main(String[] args) {
        String str[][] = {{"1", "4", "3", "4"},
                {"5", "7", "7", "8"},
                {"9", "10", "6", "6"},
                {"13", "14", "4", "0"}};

        System.out.println("Массив "+ Arrays.deepToString(str));
        System.out.println("Сумма элементов массива равна "+summ(str));


    }

    /**
     * @param arr это массив 4х4
     * @throws MyArraySizeException будет выброшено, размер массива будет не 4х4
     * @return
     */
    public static int summ(String[][] arr) throws MyArraySizeException {
        int size = 4;
        if ((arr.length == size) && (arr[0].length == size) && (arr[1].length == size) && (arr[2].length == size) && (arr[3].length == size)) {
            System.out.println("Массив 4х4");
        } else throw new MyArraySizeException("Массив не 4х4");
        return mySumma(myParseInt(arr));
    }

    /**
     * @param arr -массив для, который нужноо преобразовать
     * @return возвращает преобразованный массив
     * @throws MyArrayDataException будет выброшено, если преобразование из String в Int не удасться
     */
    public static int[][] myParseInt(String[][] arr) throws MyArrayDataException {
        int intArr[][] = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    intArr[i][j] = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    //System.out.println("My exseption");
                     throw new MyArrayDataException("Не могу выполнить преобразование в ячейке массива: " + "[" + i + "]" + "[" + j + "]", i, j);
                }
            }

        }

        return intArr;
    }

    public static int mySumma(int[][] arr) {
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                summa += arr[i][j];
        }
        return summa;
    }

}



