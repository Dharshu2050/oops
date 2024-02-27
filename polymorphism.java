import java.util.*;
public class polymorphism {

   public static void main(String[] args) {
   Method obj=new Method();
    obj.display("dharshini");
    obj.display(5);
   }
}
 /**
  * Innerpolymorphism
  */
class Method{
     void display(String v){
        System.out.println("");
     }
     void display(int a){
        System.out.println(a);
     }

    
 }