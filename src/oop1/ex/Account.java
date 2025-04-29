package oop1.ex;

public class Account {
    int balance;    //잔액
    void deposit(int amount) {
        balance += amount;
        System.out.println("입금액은 " + amount + "원 이며, 총 잔액은 " + balance + "원 입니다.");
    }
    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("출금액은 " + amount + "원 이며, 총 잔액은 " + balance + "원 입니다.");
        } else {
            //        (balance <= amount)
            System.out.println("현재 잔액은 : " + balance + "원 이며, 출금액은 " + amount +"원 이므로, 잔액 부족입니다.");
        }

    }
}
