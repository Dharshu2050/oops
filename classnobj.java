import java.util.Scanner;

class Students{
    String name;
    int age;

    void display(){
        System.out.println("Name :"+name);
    }

}



public class classnobj {
    public static void main(String[] args) {
        Students obj=new Students();
        Scanner sc=new Scanner(System.in);
        obj.name=sc.nextLine();
        obj.age=sc.nextInt();
        obj.display();
    }
    
}
