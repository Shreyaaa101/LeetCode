package CustomExceptionsJava;
public class Main
{
  public static void main(String[] args) {
  int age=4;
  try{
  if (age < 18) {
    throw new CustomException("Age must be 18 or above to register.");
    }
    }
  catch(CustomException f){
   System.out.println(f.getMessage());
}
  
  }

}
