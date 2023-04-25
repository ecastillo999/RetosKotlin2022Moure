﻿/*
* Challenge #0
* THE FAMOUS "FIZZ BUZZ"
* Difficulty: EASY
* Statement: Write a program that shows by console (with a print) the numbers from 1 to 100 (both included and with a line break between each print), replacing the following:
* - Multiples of 3 for the word "fizz".
* - Multiples of 5 for the word "buzz".
* - Multiples of 3 and 5 at a time for the word "fizzbuzz"

* Reto #0
* EL FAMOSO "FIZZ BUZZ"
* Dificultad: FÁCIL
* Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
* - Múltiplos de 3 por la palabra "fizz".
* - Múltiplos de 5 por la palabra "buzz".
* - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz
*/
void FizzBuzz()
{
    for (int number = 1; number <= 100; number++)
    {
        if (number % 15 == 0)
        {
            Console.WriteLine("FizzBuzz");
        }
        else if (number % 3 == 0)
        {
            Console.WriteLine("Fizz");
        }
        else if (number % 5 == 0)
        {
            Console.WriteLine("Buzz");
        }
        else
        {
            Console.WriteLine(number);
        }
    }
}
FizzBuzz();