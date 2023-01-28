package advanxedJava;

public class Accounts{
    int accid;
    double balance;
    int custid;

    Accounts(){

    }
    Accounts(int accid,double balance,int custid){
        this.accid=accid;
        this.balance=balance;
        this.custid=custid;
    }

    public int getAccid() {
        return accid;
    }

    public void setAccid(int accid) {
        this.accid = accid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public double deposit(double amount){
        this.balance=this.balance+amount;
        return balance;
    }
    public double withdraw(double amount){
        this.balance=this.balance-amount;
        return balance;
    }
}
