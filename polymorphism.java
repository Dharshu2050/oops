import java.util.*;
public class polymorphism {

   public static void main(String[] args) {
   Method obj=new Method();
    obj.display();
    obj.display(5);
   }
}
 /**
  * Innerpolymorphism
  */
class Method{
     void display(){
        System.out.println("dharshini");
     }
     void display(int a){
        System.out.println(a);
     }

    
 }