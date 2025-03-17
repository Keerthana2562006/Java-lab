//File Handling in java : Writing a file
import java.io.FileWriter;
import java.io.IOException;
class main{
    public static void main(String[] args) {
        try {
            FileWriter java = new FileWriter("java.txt");  //Creating & Writing a file
            java.write("Java is a High Level Programming Language");
            java.close();
            System.out.println("Java file creation & Writing is Finish");
        }catch(IOException e){
            System.out.println("File is not Created : Error");
            e.printStackTrace();


        }
    }
}