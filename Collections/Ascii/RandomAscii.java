import java.util.*;
import java.io.*;   
public class RandomAscii{
public static void main(String args[])
{
    
    int number;
    String text=" ";
    int random;
    char choice='Y';
    Random r = new Random();
    Scanner sc= new Scanner(System.in);
    //Random random= new Random();
    while(choice=='Y'){
    System.out.println("Enter the number that you want to process");
    number=sc.nextInt();

    if(number==1)
    {
        char ascii;
        random = r.nextInt(150) + 1; 
        ascii= (char)random;
        text= String.valueOf(ascii);
        System.out.println(text);
        try{
        System.out.println("Do you want to generate again? Press Y or N:");
        choice= sc.next().charAt(0);
        if(choice!='Y')
        continue;
        else if(choice=='N')
        break;
        else{
        System.out.println("Invalid Input");
        }
    }
        catch(Exception e){
        System.out.println(e);
        }

    }
    if( number==2)
    {   
        int random_num=r.nextInt(99)+1;
        System.out.println(random_num);
    }
}
}
}