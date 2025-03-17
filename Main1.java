//for loop
//package sample;
//class Run extends Thread{
//    public void running(){
//        for(int i = 1;i<5;i++){
//            System.out.println("Running......"+i);
//            try{
//                Thread.sleep(2000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//    }
//}
//public class Main1 {
//    public static void main(String []args){
//        Run r=new Run();
//        r.start();
//        r.running();
//    }
//}
//while loop
package sample;
class Run extends Thread{
    public void running(){
        int i = 1;
        while (i < 5) {
            System.out.println("Running......"+i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Main1 {
    public static void main(String []args){
        Run r=new Run();
        r.start();
        r.running();
    }
}