import java.util.Scanner;

/**
 * InnerSBI
 */
class details {

    String c_name;
    long acc_no;
    float bank_balance;

    void display_balance(){
        System.out.println("Hello"+c_name);
        System.out.println("Your current is Rs."+bank_balance);
    }
    void deposit(float amt){
        bank_balance=bank_balance+amt;
        System.out.println("Hello"+c_name);
     
        System.out.println("Your deposit amount is Rs."+amt);
        System.out.println("Your current is Rs."+bank_balance);
        System.out.println("Deposit successfully");
     }

     void withdraw(int amt){
        if(bank_balance>=amt){
            bank_balance=bank_balance-amt;
            System.out.println("your current amt is Rs."+bank_balance);
        }
        else{
            System.out.println("Insuffience balance");
        }


     }
}




public class SBI {
    public static void main(String[] args) {
   details obj=new details();
      obj.c_name="dharshu";
      obj.acc_no=123456;
      obj.bank_balance=5000;
      obj.display_balance();
      obj.withdraw(2000);
      obj.deposit(1000);

       }
        
        
    }

