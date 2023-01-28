//package advanxedJava;
//
//import java.util.ArrayList;
//
//public class Bank<Accounts> {
//    ArrayList<Accounts> accounts;
//    Bank(ArrayList<Accounts> accounts){
//        this.accounts=accounts;
//
//    }
//    public double deposit(double amount,int accid){
//        double finalbalance=0;
//        for(Accounts acc: accounts){
//            if(acc.getAccid== accid){
//                finalbalance=acc.deposit(amount);
//                System.out.println("Amount succesfully DEPOSITED to your account Balance after deposit: "+finalbalance);
//                return finalbalance;
//            }
//        }
//        System.out.println("Account doesnot exist");
//        return -1;
//    }
//    public double withdraw(int ammout,int accid){
//        double finalbalance=0;
//        for(Accounts acc: accounts){
//            if(acc.getAccid()==accid){
//                finalbalance=acc.withdraw(ammout);
//                System.out.println("Amount Succesfully Withdrawn from your account Balance withdrawn: "+finalbalance);
//                return finalbalance;
//            }
//
//        }
//        System.out.println("Account doesnt not exist ");
//        return -1;
//    }
//}
//
