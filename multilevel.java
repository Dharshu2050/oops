class whatsapp_1{
    String version="whatsapp version 1";
    void chat(){
        System.out.println("chat is avalable");

    }
    
}
class whatsapp_2 extends whatsapp_1{
    String version="whatsapp version 2";
    void  status(){
        System.out.println("status is avalable");

    }
}
class whatsapp_3 extends whatsapp_2{
    String version="whatsapp version 3";
    void  pay(){
        System.out.println("payment is avalable");

    }
}


public class multilevel {
    public static void main(String[] args) {
        whatsapp_3 obj=new whatsapp_3();
       System.out.println(obj.version);
       obj.pay();
       obj.chat();
       obj.status();


    }
}
