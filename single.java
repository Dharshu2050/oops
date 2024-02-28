/**
 * Innersingle
 */
class fruit {
     String color,shape;
     int price;

     void taste(){
        System.out.println("It's yummy");
     }

     void peel(){
        System.out.println("It's a peel fruit");
     }

    
}

/**
 *  
 */
 class  orange extends fruit {
    void vitamin(){
        System.out.println("Vitamin C");

    }


    
}


public class single {
    public static void main(String[] args) {
        orange obj=new orange();
        obj.color="orange";
        obj.shape="circle";
        obj.price=100;
        obj.vitamin();
        System.out.println(obj.color);
        System.out.println(obj.shape);
        System.out.println(obj.price);
    }
}
