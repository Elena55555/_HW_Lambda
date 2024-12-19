package org.example;

public class Task1 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        Expression expression = (n) -> n % 2 ==0;
        System.out.println(sumOfEven(array, expression));
        }
    public static  int sumOfEven (int [] array, Expression exp)  {
        int result = 0;
        for (int element : array) {
            if (exp.isEqual(element)) {
                result+= element;
            }

        }
        return result;

    }
    }
interface Expression {
    boolean isEqual(int a);
}