import java.util.List;
import java.util.ArrayList;
class list{
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("kiwi");
        list.add("Grapes");
        list.add("Orange");
        System.out.println("Fruits:"+list);
        //implimentation of list1
        list.remove("kiwi");
        System.out.println("Fruits:"+list);
        //implimentation list2
        String find_fruit =list.get(0);
        System.out.println("using index:"+find_fruit);
    }
}