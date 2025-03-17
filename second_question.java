public class second_question {
    public static void main(String[]args) {
        //int[] array = {1, 2, 3, 4, 5, 6};//creating the array
        //System.out.println("My array:" + array[10]);
        //int a = 10;
        //int b = 0;
        //int div = a / b;
        try{
            int[] array = {1, 2, 3, 4, 5, 6};//creating the array
            System.out.println("My array:" + array[10]);
            int a = 10;
            int b = 0;
            int div = a / b;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Error is solving");
        }
        catch(ArithmeticException e) {
            System.out.println("ArithmeticExceptionError is solving")
        }
        }
    }

