public class NthElement {
//  ## Algorithm
//
//  Write a method that takes two parameters:
//          - an array of positive integer numbers, called `numbers`
//          - a positive integer number, called `n`
//
//  The method should calculate the average of every `n`th element of the array and return it.
//
//          __Example:__
//  For number array [2, 4, 10, 34, 3, 16, 3, 21]
//
//          - if n =  3, result = 13 _(for elements 10, 16)_
//- if n = 2, result = 18.75 _(for elements 4, 34, 16, 21)_
//- if n = 10, result = 0 _(no valid element)_
//
//## Testing
//
//  Write two tests for your method:
//          - case 1: n is less than the size of the number array size
//- case 2: n is greater than the size of the number array size

  public static void main(String[] args) {
    int[] numbers = {2, 4, 10, 34, 3, 16, 3, 21};
    System.out.println(getAverage(numbers,3));

  }

//  public static double getAverage(int[] numbers, int n){
//    int total = 0;
//    double average = 0;
//    int numberOfElements = numbers.length/n;
//    if(n<=numbers.length) {
//      for (int i = n - 1; i < numbers.length; i += n) {
//
//        total += numbers[i];
//
//      }
//    } else{
//      return 0;
//    }
//
//    average = (double)total/numberOfElements;
//
//    return average;
//
//  }

  public static double getAverage(int[] numbers, int n){

    // Az ellenorzest erdemes elore tenni, es csak akkor letrehozni variableket, ha szukseg van rajuk. amugy minden sor ugyanaz, kiveve hogy az average valtozot is meg lehet sporolni

    if(n>numbers.length)
        return 0;

    int total = 0;
    int numberOfElements = numbers.length/n;

    for (int i = n - 1; i < numbers.length; i += n)
        total += numbers[i];

    return (double)total/numberOfElements;

  }

}
