import java.io.FileWriter;
import java.io.IOException;
public class Create_file {
    public static void main(String [] args){
        try{
            FileWriter java=new FileWriter("Java_oops.txt");
            java.write("\"Object-Oriented Programming (OOP) Concepts:\\n\" +\n" +
                    "                    \"1. Encapsulation: Bundling data and methods that operate on that data into a single unit.\\n\" +\n" +
                    "                    \"2. Abstraction: Hiding the complex implementation details and showing only the essential features.\\n\" +\n" +
                    "                    \"3. Inheritance: A mechanism where one class acquires the properties and behaviors of another class.\\n\" +\n" +
                    "                    \"4. Polymorphism: The ability to take many forms, such as method overloading or method overriding.\\n\" +\n" +
                    "                    \"5. Class: A blueprint or prototype from which objects are created.\\n\" +\n" +
                    "                    \"6. Object: An instance of a class that holds data and methods.\\n\" +\n" +
                    "                    \"7. Method: A function defined inside a class that describes the behaviors of objects.\\n\" +\n" +
                    "                    \"8. Constructor: A special method used to initialize objects when they are created.\\n\" +\n" +
                    "                    \"9. Interface: A reference type, similar to a class, that can contain only constants, method signatures, etc.\\n\" +\n" +
                    "                    \"10. Overloading: The ability to define multiple methods with the same name but different parameters.\n");
            java.close();
            System.out.println("file created");
        }
        catch(IOException e){
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
