package task6__backpack_problem;
import java.util.*;

public class BackpackProblem {
    public static void backpackProblem(){
        final Item item1=new Item("Cheese", 20,20);
        final Item item2=new Item("Tomatoes",5,10);
        final Item item3=new Item("Bread",2,8);
        final Item item4=new Item("Apples",30,25);
        final Item item5=new Item("Chiken",25,18);
        final Item item6=new Item("Cucumbers",7,15);

        final Item[] items={item1, item2, item3, item4, item5, item6};

        Arrays.sort(items, Comparator.comparingDouble(Item::pricePerUnitOfWeigth).reversed());

        System.out.println("Your sorted Items:"+Arrays.toString(items));

        final int MAX_WGTH=35;

        int weigthSoFar=0;
        double priceSoFar=0;
        int currentItem=0;

        while(currentItem<items.length && weigthSoFar!=MAX_WGTH){
            if(weigthSoFar+items[currentItem].getWeigth()<MAX_WGTH){
                priceSoFar+=items[currentItem].getPrice();
                weigthSoFar+=items[currentItem].getWeigth();
            }
            else{
                priceSoFar+=((MAX_WGTH-weigthSoFar)/(double)items[currentItem].getPrice())*items[currentItem].getPrice();
                weigthSoFar=MAX_WGTH;
            }
            currentItem++;
        }
        System.out.println("The value of the best set of things: "+priceSoFar);
    }

}
