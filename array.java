public class array {
    public static void main(String[]args){
            //int[]array={1,2,3,4,5,6};//creating the array
            //System.out.println("My array:"+array[10]);
        try{
            int[]array={1,2,3,4,5,6};//creating the array
            System.out.println("My array:"+array[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound is 10");
        }
        }

    }

