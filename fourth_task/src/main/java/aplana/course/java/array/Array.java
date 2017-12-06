package aplana.course.java.array;

import java.util.Random;

/**
 * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива.
 * Поменять их местами.
 */
public class Array {
    public static final int ARRAY_LENGTH = 20;
    public static void main(String[] args) {
        int indexMaxNegative, indexMinPositive;
        boolean negative = true, positive = true;
        int randNumbers[] = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++){
            Random random = new Random();
            randNumbers[i] = -10 + random.nextInt(11+10);
            System.out.println(i + ") " + randNumbers[i]);
        }
        indexMaxNegative = findMaxNegativeIndex(randNumbers);
        System.out.println("Max negative number is " + randNumbers[indexMaxNegative]);
        if (indexMaxNegative == 1000) {
            System.out.println("There are no negative numbers");
            negative = false;
        }
        indexMinPositive = findMinPositive(randNumbers);
        System.out.println("Min positive number is " + randNumbers[indexMinPositive]);
        if (indexMinPositive == 1000) {
            System.out.println("There are no positive numbers");
            positive = false;
        }

        if (positive && negative) {
            swap(randNumbers,indexMaxNegative,indexMinPositive);
            for (int i = 0; i < ARRAY_LENGTH; i++) {
                System.out.println(i + ") " + randNumbers[i]);
            }
        }
        else System.out.println("There is no positive or negative number, nothing to swap");
    }


    /**
     *
     * @param array to find max negative element
     * @return max negative number from array
     */
    public static int findMaxNegativeIndex(int array[]){
        int maxNegative = -1000;
        int indexMaxNegative = 1000;
        for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    maxNegative = array[i];
                    indexMaxNegative = i;
                    break;
                }
        }
        if (maxNegative != -1000) {
            for (int i = 0; i < array.length; i++) {
                if ((array[i] > maxNegative) && (array[i] < 0)) {
                    maxNegative = array[i];
                    indexMaxNegative = i;
                }
            }
        }
        return indexMaxNegative;
    }

    /**
     *
     * @param array to find min positive element
     * @return min positive number from array
     */
    public static int findMinPositive(int array[]){
        int minPositive = 1000;
        int indexMinPositive = 1000;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0) {
                minPositive = array[i];
                indexMinPositive = i;
                break;
            }
        }

        if (minPositive != 1000) {
            for (int i = 0; i < array.length; i++) {
                if ((array[i] > 0) && (array[i] < minPositive)) {
                    minPositive = array[i];
                    indexMinPositive = i;
                }
            }
        }
        return indexMinPositive;
    }


    /**
     *
     * @param array where will change max negative and min positive
     * @param indexMaxNeg is index of max negative number
     * @param indexMinPos is index of min positive number
     * @return updated array
     */
    public static int [] swap (int array[], int indexMaxNeg, int indexMinPos) {
        int tmp = array[indexMaxNeg];
        array[indexMaxNeg] = array[indexMinPos];
        array[indexMinPos] = tmp;
        return array;
    }
}
