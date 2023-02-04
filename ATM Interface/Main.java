import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperInterface op = new AtmOperImpl();

        int atmNo = 12345;
        int atmpass = 987;

        Scanner sc = new Scanner(System.in);
        System.out.println("-------Welcome to ATM Interface-------");
        System.out.print("Enter Account Number : ");
        int atmNum = sc.nextInt();
        System.out.print("Enter Account Password : ");
        int atmpassword = sc.nextInt();

        if ((atmNo==atmNum) && (atmpass==atmpassword)){
            while(true){
                System.out.println("Please choose any one among the following options ");
                System.out.println();
                System.out.println("1.Transaction History\n2.Withdraw Amount\n3.Deposit Amount\n4.Transfer Amount\n5.Exit");
                System.out.println();
                System.out.print("Enter Choice : ");

                int ch = sc.nextInt();
                switch (ch){
                    case 1 :
                        op.viewBalance();
                        op.viewTransactionHistory();
                        break;

                    case 2 :
                        System.out.print("Enter Amount to WithDraw : ");
                        double withdraw = sc.nextDouble();
                        op.withdraw(withdraw);
                        break;

                    case 3 :
                        System.out.print("Enter Amount to Deposit : ");
                        double deposit = sc.nextDouble();
                        op.deposit(deposit);

                        break;

                    case 4 :
                        System.out.print("Enter Account Number to Transfer: ");
                        double accountNo = sc.nextDouble();
                        System.out.print("Enter the Amount to be Transferred:");
                        double transferamt = sc.nextDouble();
                        op.transfer(transferamt);

                        break;

                    case 5 :
                        System.out.println("Thank You!, Visit Again");
                        System.exit(0);
                        break;

                    default:
                        System.out.println();
                        System.out.println("Enter correct choice. ");
                        break;
                }
            }
        }

        else if((atmNo!=atmNum)&&(atmpass!=atmpassword)){
            System.out.println("Incorrect Atm Number and Password.");
            System.exit(0);
        }

        else if(atmNo!=atmNum) {
            System.out.println("Incorrect Atm Number.");
            System.exit(0);
        }
        else if(atmpass!=atmpassword){
            System.out.println("Incorrect Password.");
            System.exit(0);
        }

    }
}
