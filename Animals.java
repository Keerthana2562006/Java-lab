//
package sample;
class Animal extends Thread {
    public void animal1() {
        String name = "dog";
        String colour = "black";
        int age = 4;
        String price = "50$";

        System.out.println("ANIMAL DETAILS");
        System.out.println("_____________________________________");
        System.out.println("Animal name:" + name);
        System.out.println("Animal colour:" + colour);
        System.out.println("Animal age:" + age);
        System.out.println("Animal price:" + price);
    }
    public void animal2() {
        String name = "cat";
        String colour = "black";
        int age = 4;
        String price = "50$";

        System.out.println("ANIMAL DETAILS");
        System.out.println("_____________________________________");
        System.out.println("Animal name:" + name);
        System.out.println("Animal colour:" + colour);
        System.out.println("Animal age:" + age);
        System.out.println("Animal price:" + price);

    }
    public void animal3() {
        String name = "elephant";
        String colour = "black";
        int age = 4;
        String price = "50$";

        System.out.println("ANIMAL DETAILS");
        System.out.println("_____________________________________");
        System.out.println("Animal name:" + name);
        System.out.println("Animal colour:" + colour);
        System.out.println("Animal age:" + age);
        System.out.println("Animal price:" + price);
    }
        public static void main (String[] args) {
            Animal a = new Animal();
            // Call the method to print animal details
            a.animal1();
            a.animal2();
            a.animal3();

        }
    }
