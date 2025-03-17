import java.util.List;
import java.util.ArrayList;
class Citys{
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("bangluru");
        list.add("chenni");
        list.add("jaipur");
        list.add("goa");
        list.add("pune");
        System.out.println("cities:"+list);
        //implimentation of list1
        list.remove("bangluru");
        System.out.println("cities:"+list);
        //implimentation list2
        String find_cities =list.get(0);
        System.out.println("using index:"+find_cities);
    }
}