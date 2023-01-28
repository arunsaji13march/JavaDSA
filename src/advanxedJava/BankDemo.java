package advanxedJava;

import java.util.ArrayList;

public class BankDemo {
    public static void main(String args[]){
        ArrayList<Accounts> list=new ArrayList<Accounts>();
        //Accounts acc1=new Accounts(1001,5000,12001);
        Accounts acc2=new Accounts(1002,4000,12002);
        Accounts acc3=new Accounts(1003,55000,12003);
        Accounts acc4=new Accounts(1004,99000,12004);

        list.add(new Accounts(1001,5000,12001));
        list.add(acc2);
        list.add(acc3);
        list.add(acc4);
//
//        Bank bank=new Bank(list);
//        bank.deposit(2311,1001);
//        bank.withdraw(3333,1003);
//        bank.deposit(33000,1002);
//        bank.withdraw(3033,1009);
//        bank.deposit(44,1001);
    }


}
