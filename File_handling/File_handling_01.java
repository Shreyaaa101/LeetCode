import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.File;
class File_handling_01{
    public static void main(String args[])
    {
        try{
        File f= new File("text.txt");
        FileWriter obj= new FileWriter(f,true);
        obj.write("Working with files is EZZZZZZZZ \n");
        System.out.println(f.canWrite());
        obj.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}