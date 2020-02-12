package oose.dea.bankdemo;

public class StortThread extends Thread {

    private Bank bank;
    private int amount;

    public StortThread(Bank bank, int amount){
        this.bank = bank;
        this.amount = amount;
    }


    public void run(){
        bank.stort(amount);
    }

}
