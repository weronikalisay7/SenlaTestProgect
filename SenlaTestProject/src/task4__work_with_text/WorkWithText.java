package task4__work_with_text;
import java.util.*;

public class WorkWithText {
    public static void workWithText(){
        Scanner in= new Scanner(System.in);
        System.out.println("Input your text:");
        String text=in.nextLine();
        String[] wordsOfOurText=text.toLowerCase().replaceAll("[-.?!)(,:]","").split("\\s");
        System.out.println("Input word that you want to count:");
        String word=in.nextLine();
        int count=0;
        for(int i=0;i<wordsOfOurText.length;i++){
            if(word.equals(wordsOfOurText[i])){
                ++count;
            }
        }
        System.out.println(word+": "+count);
    }
}
