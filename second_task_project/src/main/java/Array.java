import java.util.Scanner;

/**
 *  Поиск максимального элемента в массиве.
 *  Для начала задать массив слов.Размерность массива произвольна, задается в консоли.
 *  После чего в консоли вводятся слова в количестве равном заданной длине массива.
 *  В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
 */

public class Array {
    private String array[];
    private int arr_length;
    private Scanner scanner = new Scanner(System.in);

    public Array(){
        System.out.println("Input the length of array: ");
        setArr_length(scanner.nextInt());
        System.out.println("Input the elements of array in right order: ");
        String words[] = new String[arr_length];
        for (int i = 0; i < arr_length; i++){
            words[i] = scanner.next();
        }
        setArray(words);
    }

    public void setArray(String arr[]){
        this.array = new String[arr.length];
        for (int i = 0; i < arr.length; i++){
            this.array[i] = arr[i];
        }
    }
    public String[] getArray() {
        return array;
    }

    public int getArr_length() {
        return arr_length;
    }

    public void setArr_length(int arr_length) {
        this.arr_length = arr_length;
    }

    public String maxLengthWord(){
        String maxWord = this.array[0];
        int max = this.array[0].length();
        for (int i=0; i < getArr_length(); i++){
            if (this.array[i].length() > max) {
                maxWord = this.array[i];
                max = this.array[i].length();
            }
        }
        return maxWord;
    }
}
