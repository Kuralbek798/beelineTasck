import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class StringArrayManipulator {
    private String[] stringArray;

    public StringArrayManipulator(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public void addString(String newString) {
        //создаем новый масив и присваиваем значения из текущего массива
        String[] actualArray = stringArray;
        // создаем за нова stringArray и увеличиваем размер на один элемент
        stringArray = new String[actualArray.length + 1];

        for (int i = 0; i <= actualArray.length; i++) {
            //заполняем значениями новый масив и ставим проверку что бы не получить ошибку индекс в не диапазона так как диапазон индексов actualArray меньше по размеру
            if(i < actualArray.length){
                stringArray[i] = actualArray[i];
            }
            if (i == actualArray.length) {
                stringArray[i] = newString;
            }
        }

        //return actualArray;
    }

    //Метод для вывода строк массива
    public void printArray() {
        System.out.println(Arrays.toString(stringArray));
    }

    // Метод для не знаю пока для чего
    public int findLongestString() {
        int maxLength = 0;
        for (String str : stringArray) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        return maxLength;
    }

    // Метод для переворачивания каждой строки в масиве
    public void reverseString() {
        for (int i = 0; i < stringArray.length; i++) {

            char[] charsArray = stringArray[i].toCharArray(); // создаем масив символов из строки
            int left = 0;  // индекс первого символа
            int right = charsArray.length - 1; // индекс последнего элемента

            while (left < right) {//прверяем если условие верно то перемещаем элементы местами
                char temp = charsArray[left];
                charsArray[left] = charsArray[right];
                charsArray[right] = temp;
                left++; // меняем индексы что бы получить следующий элемент с начала массива
                right--; // меняем индекс что бы получить следующий элемени с конца массива
            }
            stringArray[i] = new String(charsArray); // присваиваем перевернутую строку в массив строк
        }
       // return stringArray;
    }

}
