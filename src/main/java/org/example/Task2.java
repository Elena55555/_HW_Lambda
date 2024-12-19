package org.example;

public class Task2 {
    public static void main(String[] args) {


        String [] words1 = {"TheFirstDay","FirstDay","Day"};

        final  int maxLength = 8;
        final String longestWord ="";

        Expression2 expression2 =  n  -> n.length() > maxLength;

        System.out.println(maxLine(words1, expression2));
    }
    public static String maxLine (String [] words1, Expression2 exp)  {
        String result = " ";
        for (String element : words1) {
            if (exp.isEqual(element)) {
                result += element;
            }
        }
        return result;
    }
}
interface Expression2 {
    boolean isEqual(String a);
}
