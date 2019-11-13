package main_test;
import static task1__number_description.NumberDescription.numberDescription;
import static task2__common_multiple_and_divisor.CommonMultipleAndDivisor.commonMultipleAndDivisor;
import static task3__words_in_sentence.WordsInSentence.wordsInSentence;
import static task4__work_with_text.WorkWithText.workWithText;
import static task5__palindrome_numbers.PalindromeNumbers.palindromeNumbers;
import static task6__backpack_problem.BackpackProblem.backpackProblem;

public class Main {
    public static void main(String[]args){
        numberDescription();
        System.out.println("-----------------------------------");
        commonMultipleAndDivisor();
        System.out.println("-----------------------------------");
        wordsInSentence();
        System.out.println("-----------------------------------");
        workWithText();
        System.out.println("-----------------------------------");
        palindromeNumbers();
        System.out.println("-----------------------------------");
        backpackProblem();
        System.out.println("-----------------------------------");
    }
}
