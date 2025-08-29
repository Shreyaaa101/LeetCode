import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class File_handling_01{
    public static void main(String args[])
    {
        try{
        FileWriter obj= new FileWriter("file.txt",true);
        obj.write("Working with files is EZZZZZZZZ \n");
        obj.close();
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}