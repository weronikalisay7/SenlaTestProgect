package task3__words_in_sentence;
import java.util.*;

public class WordsInSentence {
    public static void wordsInSentence(){
        Scanner in=new Scanner(System.in);
        System.out.println("Input your sentence: ");
        String yourInput=in.nextLine();
        numberOfWordsInSentence(yourInput);
        sortString(yourInput);
        upperSymbol(yourInput);
    }
    public static void numberOfWordsInSentence(String str)
    {
        int count=0;
        if(str.length()!=0){
            count++;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    count++;
                }
            }
        }
        System.out.println("You input "+count+" words!");
    }
    public static void sortString(String str){
        String[] words=str.toLowerCase().replaceAll("[-.?!)(,:]","").split("\\s");
        Comparator<String> comparator=new LengthComparator();
        Arrays.sort(words,new LengthComparator());
        for(String s:words){
            System.out.println(s);
        }
    }
    public static void upperSymbol(String str)
    {
        String s2="";
        s2=s2+str.substring(0,1).toUpperCase();
        for(int i=1;i<str.length();i++){
            if(" ".equals(str.substring(i-1, i)))
                s2=s2+str.substring(i,i+1).toUpperCase();
            else
                s2=s2+str.substring(i,i+1);

        }
        System.out.println(s2);
    }
}
