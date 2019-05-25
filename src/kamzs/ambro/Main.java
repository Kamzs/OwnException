package kamzs.ambro;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account(0);

        System.out.println("user: i want to deposit 1000");

        System.out.println("bank: " + account1.deposit(1000));


        System.out.println("user: i want to withdraw 1500");

        System.out.println("bank: "+ account1.withdraw(1500));


    }
}
