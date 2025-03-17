import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("graps");
        list.add("kiwi");
        list.add("banana");

        System.out.println("FRUITS");
        System.out.println("************");
        System.out.println(list);

        for(String fruit:list){
            System.out.println(fruit);
            }

        }

    }
