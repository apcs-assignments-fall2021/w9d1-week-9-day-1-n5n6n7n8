import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your preferred name?");
        String name = scan.nextLine();
        BankAccount account = new BankAccount((int) (Math.random()*10000), name);
        System.out.println(account);
        Boolean doneWithInteraction = false;
        while(!doneWithInteraction){
            name = account.getPreferredName();
            System.out.println("Hi, " + name + ". What would you like to do? (withdraw/deposit/check balance/check account number/set preferred name/print summary/leave)");
            String choice = scan.nextLine().toLowerCase();
            System.out.println("Option = " + choice);
            if(choice.equals("leave")) {
                System.out.println("Have a nice day!");
                doneWithInteraction=true;
            }
            else if(choice.equals("withdraw")) {
                System.out.println("Enter a value to withdraw");
                int withAmount = scan.nextInt();
                String placehold = scan.nextLine();
                Boolean positiveAmount = account.withdrawl(withAmount);
                if(positiveAmount) {
                    System.out.println("You now have $" + account.getBalance() + " in your bank");
                }
                else{
                    System.out.println("You are in debt because you withdrew too much!");
                    doneWithInteraction=true;
                }
            }
            else{
                System.out.println("The bank was left unfinished, therefore these options do not exist");
                doneWithInteraction=true;
            }
        }
    }
}
