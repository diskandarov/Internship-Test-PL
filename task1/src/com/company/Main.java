package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int arraySize = Integer.valueOf(args[0]);
        int intervalLength = Integer.valueOf(args[1]);
        List<Integer> circleArray = new ArrayList<>();
        // Создание кругового массива
        for (int i = 0; true; i++) {
            // Условие, когда 1 обход массива заканчивается
            if (!circleArray.isEmpty() && circleArray.size() % intervalLength == 0) {
                i -= 1;
            }
            // Условие, когда один цикл кругового массива заканчивается
            if (i == arraySize && i != intervalLength) {
                i = 0;
            }
            circleArray.add(i + 1);
            // Условие, когда последний элемент обхода равен 1
            if (circleArray.size() % intervalLength == 0 && circleArray.get(circleArray.size() - 1) == 1) {
                break;
            }
        }
        String result = "";
        //Получение первым чисел интервалов
        for (int i = 0; i < circleArray.size(); i += intervalLength) {
            result = result + circleArray.get(i);
        }
        System.out.println(result);
    }
}
