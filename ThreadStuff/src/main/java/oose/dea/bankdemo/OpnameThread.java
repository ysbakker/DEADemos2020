package oose.dea.bankdemo;

public class OpnameThread extends Thread {

    private Bank bank;
    private int amount;

    public OpnameThread(Bank bank, int amount){
        this.bank = bank;
        this.amount = amount;
    }


    public void run(){
        bank.neemOp(amount);
    }
}
