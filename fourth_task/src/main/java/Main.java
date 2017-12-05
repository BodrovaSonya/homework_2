import java.util.Random;

/**
 * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива.
 * Поменять их местами.
 */
public class Main {
    public static final int ARRAY_LENGTH = 20;
    public static void main(String[] args) {
        int randNumbers[] = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++){
            Random random = new Random();
            randNumbers[i] = -10 + random.nextInt(11+10);
            System.out.println(i + ") " + randNumbers[i]);
        }
        System.out.println("Max number is: " + findMaxnegative(randNumbers));
    }


    /**
     *
     * @param array to find max element
     * @return max number from array
     */
    public static int findMaxnegative(int array[]){
        int maxNegative = -1000;
        int indexMaxNegative = 0;
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
        else {
            System.out.println("There are no negative numbers");
            return -30;
        }
        return indexMaxNegative;
    }

}
