package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000); //오류 메세지 출력

        System.out.println("현재 잔고 :" + account.balance);
    }
}
