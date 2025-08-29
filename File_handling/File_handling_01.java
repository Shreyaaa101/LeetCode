import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.io.File;

class File_handling_01{
    void write_File(){
        try{
            File f= new File("text.txt");
            FileWriter obj= new FileWriter(f,true);
            obj.write("Working with files is EZZZZZZZZ Amazing\n");
            System.out.println(f.canWrite());
            obj.close();
            }
            catch(IOException e){
                System.out.println(e);
            }
}
    void read_file(){
        try{
            File f= new File("text.txt");
            Scanner sc= new Scanner(f);
            while(sc.hasNextLine()){
                String data=sc.nextLine();
                System.out.println(data);
                
        } 
         sc.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
       
            }
    public static void main(String args[])
    {
        File_handling_01 ob= new File_handling_01();
        ob.write_File();
        ob.read_file();
    }
    }
