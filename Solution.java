package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sum =0;
        int currentDigit;

        currentDigit=number%10;
        sum=sum+currentDigit;
        number=number/10;
        currentDigit=number%10;
        sum=sum+currentDigit;
        number=number/10;
        currentDigit=number;
        sum=sum+currentDigit;

return (sum);

    }
}