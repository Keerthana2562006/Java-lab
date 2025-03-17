class CheckSeasons extends Exception{//custom Exception class--01
    CheckSeasons(){
        super("please give valid month");
    }
}
public class Season{public static void checkMonth(String month) throws CheckSeasons{
    if(month=="jan"||month=="Dec"||month=="Feb"){
        System.out.println("This is ur Favourite Winte...!");
    }
    else if(month=="Mar"||month=="Arp"||month=="May"){
        System.out.println("This is ur Favourite SUMMER...!");
    }
    else if(month=="jun"||month=="jul"||month=="aug"){
        System.out.println("This is ur Favourite RAINY...!");
    }
    else if(month=="sep"||month=="oct"||month=="nov") {
        System.out.println("This is ur Favourite AUTOM...!");
    }else{
        throw new CheckSeasons();
    }
}

public static void main(String[]args) {
    try {
        checkMonth("Arp");
    } catch (CheckSeasons e) {
        System.out.println("Caudht expection:" + e.getMessage());
    } finally {
        System.out.println("Seasons is completrd..!");
    }
}}






