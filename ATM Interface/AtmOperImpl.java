import java.util.HashMap;
import java.util.Map;

public class AtmOperImpl implements AtmOperInterface {
    ATM atm = new ATM();
    Map<Double,String> transfer = new HashMap<>();

    public void viewTransactionHistory() {
        System.out.println("-------Transaction History-------");
        for (Map.Entry<Double,String>m:transfer.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }

    }
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : "+atm.getBalance());
        System.out.println();

    }

    @Override
    public void withdraw(double withdraw) {
        if (atm.getBalance() < withdraw) {
            System.out.println("Insufficient Amount to WithDraw.\nPlease enter amount within the available balance.");
            viewBalance();
        }

        else {
            transfer.put(withdraw," Amount Withdrawn");
            System.out.println("Collect the money " + withdraw);
            atm.setBalance(atm.getBalance() - withdraw);
            viewBalance();
        }
    }

    @Override
    public void deposit(double deposit) {
        transfer.put(deposit," Amount Deposited");
        System.out.println(deposit + " Deposited Successfully!!");
        atm.setBalance(atm.getBalance() + deposit);
        viewBalance();

    }

    @Override
    public void transfer(double transferamt){
        if(transferamt< atm.getBalance()){
            transfer.put(transferamt," Amount Transfered");
            System.out.println(transferamt + " Transfered Successfully!!");
            atm.setBalance(atm.getBalance() - transferamt);
            viewBalance();
        }
        else{
            System.out.println("Insufficient Balance to Transfer.\nPlease enter amount within the available balance.");
            viewBalance();
        }

    }
}
