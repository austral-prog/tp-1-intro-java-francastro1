package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        int max = a;
        if (a > b) {
            return max;
        }
        return b;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        if (n==0) {
            return 1;
        }
        return n*factorial(n-1);
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            count += 1;
        }
        return count;
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String newstring = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            newstring += input.charAt(i);
        }
        return newstring;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6){
            if (number % i == 0 || number % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int min = 100000;
        for (int number : array){
            if (min > number){
                min = number;
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++)
            suma += array[i];
        return suma;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        int farenheit = 0;
        if (celsius == 0.0){
            farenheit = 32;
            return farenheit;
        }
        farenheit = (int) (celsius * ((double) 9 /5) + 32);
        return farenheit;
    }
}
