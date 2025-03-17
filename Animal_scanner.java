import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Animal_scanner {
    public static void main(String[]args){
        List<String> animals = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for(;;) { //for for loop
            System.out.println("Enter Animal name:(type'done' to Finish) ");
            String animal = s.nextLine();
            if(animal.equalsIgnoreCase( "done")){
                break;
            }
            animals.add(animal);
        }

        System.out.println("Animal: " + animals);
    }
}
