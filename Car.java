import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Car {
    public static void main(String[]args) {
        List<String> car1 = new ArrayList<>();
        System.out.println("CAR DEATILS");
        System.out.println("-------------");
        System.out.println("car deatils :" + car1);
        List<String> car2 = new ArrayList<>();
        System.out.println("car deatils :" + car2);
        List<String> car3 = new ArrayList<>();
        System.out.println("car deatils :" + car3);

        Scanner c1 = new Scanner(System.in);//creating a scanner class
        Scanner c2 = new Scanner(System.in);
        Scanner c3 = new Scanner(System.in);
        System.out.println("ENTERB CAR DEATILS:(type 'done' to finish)");

        while(true){
            System.out.println("Enter car1 name" );
            String car11=c1.nextLine();
            if(car11.equalsIgnoreCase("done")){
                break;

            }
            System.out.println("Enter car1 colour" );
            String car12=c1.nextLine();

            System.out.println("Enter car1 price" );
            String car13=c1.nextLine();


            car1.add(car11);
            car1.add(car12);
            car1.add(car13);
// car 2
            System.out.println("Enter car2 name" );
            String car21=c2.nextLine();
            if(car11.equalsIgnoreCase("done")){
                break;

            }
            System.out.println("Enter car2 colour" );
            String car22=c2.nextLine();

            System.out.println("Enter car2 price" );
            String car23=c2.nextLine();


            car2.add(car21);
            car2.add(car22);
            car2.add(car23);

            // car3
            System.out.println("Enter car3 name" );
            String car31=c3.nextLine();
            if(car11.equalsIgnoreCase("done")){
                break;

            }
            System.out.println("Enter car3 colour" );
            String car32=c1.nextLine();

            System.out.println("Enter car3 price" );
            String car33=c1.nextLine();


            car3.add(car31);
            car3.add(car32);
            car3.add(car33);
        }
        System.out.println("car1 deatils: "+car1);
        System.out.println("car2 deatils: "+car2);
        System.out.println("car3 deatils: "+car3);
        }

}
