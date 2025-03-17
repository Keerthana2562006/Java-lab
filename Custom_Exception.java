
class InvalidAge extends Exception{//custom exception class
    InvalidAge(){//custom exception constructer
        super("age is above 18");

    }
}
public class Custom_Exception {
    public static void checkAge(int age)throws InvalidAge{
        if (age >18){
            throw new InvalidAge();
        }
        else{
            System.out.println("Age is valid : " + age);
        }
    }

    public static void main(String[]args){
        try{
            checkAge(20);
        }
        catch(InvalidAge e){
            System.out.println("Caugth exception: "+ e.getMessage());
        }

    }
}
