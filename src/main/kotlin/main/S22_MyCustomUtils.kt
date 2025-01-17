
package org.example.main
import java.util.*

    /**-----Example 01-----*/
    fun Date.yearNowPlus(): Int = year + 1

    /**-----Example 02-----*/
    fun Date.yearNowActualPlus(): Int = year + 1900 + 1

    /**-----Example 03-----*/
    fun Date.yearNowActualMinus(): Int = year + 1900 - 1

    /**-----Example 04-----*/
    // Объявление функции-расширения для типа Int
    fun Int.isEvenNumber(): Boolean {
        // Использование встроенных функций div (деление) и times (умножение)
        // Проверяем, является ли число четным путем деления его на 2 и последующего умножения на 2
        // Сравниваем результат с исходным числом
        return this.div(2).times(2) == this
    }
    // Функции-расширения позволяют добавлять новые функции к существующим типам без изменения их исходного кода.
    // В данном примере мы добавляем функцию isEvenNumber к типу Int, которая возвращает true, если число четное, и false в противном случае.
    // Импортируя функцию с алиасом isEven, мы можем вызывать её более кратко.
    // Вызов 4.isEven() проверяет, является ли число 4 четным, и выводит результат на экран.