import java.util.LinkedList;

// Create a class to hold person info
class Data {
    String name;
    int age;
    double salary;

    Data(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class WrapperCustom {
    public static void main(String[] args) {
        // Now store Data objects in LinkedList
        LinkedList<Data> list = new LinkedList<>();
        list.add(new Data("Alice", 25, 55000));
        list.add(new Data("Bob", 30, 60000));

        // You can add more code here to, for example, print the list contents
        for (Data d : list) {
            System.out.println("Name: " + d.name + ", Age: " + d.age + ", Salary: " + d.salary);
        }
    }
}
