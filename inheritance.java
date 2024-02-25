public class inheritance {
    int nolegs=4;
   public static void eat(){
        System.out.println("i am eating ");
    }
    public static void walk(){
        System.out.println("i am walking");
    }
}

/**
 * Innerinheritance
 */
class dog extends inheritance{

    
    boolean canbark=true;
}
class call{
    public static void main(String[] args) {
        dog obj=new dog();
        System.err.println(obj.nolegs);
        System.out.println(obj.canbark);
        obj.eat();
        obj.walk();
    }
   
    
}