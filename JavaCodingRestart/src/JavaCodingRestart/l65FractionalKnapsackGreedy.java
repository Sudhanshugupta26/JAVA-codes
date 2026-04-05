package JavaCodingRestart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class l65FractionalKnapsackGreedy {
    private static class Item{
        int value;
        int weight;
        public String toString(){
            return value+" "+weight;
        }
    }

    private static class ItemComparator implements Comparator<Item>{
        public int compare(Item a, Item b){
            if ((a.value/a.weight)>(b.value/b.weight)) return -1;
            else if((a.value/a.weight)<(b.value/b.weight)) return 1;
            else return 0;
        }
    }

    public static void main(String[] args) {
        List<Integer> value = List.of(60,100,150,120);
        List<Integer> weight = List.of(10,20,50,15);
        List<Item> ItemsList = new ArrayList<>();
        for (int i = 0; i < value.size(); i++) {
            Item item = new Item();
            item.value = value.get(i);
            item.weight = weight.get(i);
            ItemsList.add(item);
        }
        ItemsList.sort(new ItemComparator());
        System.out.println(ItemsList);
        int capacity = 30;
        int i = 0;
        int profit = 0;
        while (capacity>0){
            if(ItemsList.get(i).weight <= capacity){
                capacity -= ItemsList.get(i).weight;
                profit += ItemsList.get(i).value;
                i++;
            }else{
                profit += (ItemsList.get(i).value/ItemsList.get(i).weight)*capacity;
                capacity = 0;
            }
        }
        System.out.println(profit);
    }
}
