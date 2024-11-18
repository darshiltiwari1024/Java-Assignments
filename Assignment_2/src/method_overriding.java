public class method_overriding {
    int account_no = 123;
    int account_balance = 45000;

    void getAccount() {
        System.out.println("Account No : " + account_no);
        System.out.println("Account Balance : " + account_balance);

    }
}
    class Account extends method_overriding {
        String name = "John";
        String branch = "Indore";

        void getAccount() {
            System.out.println("Account holder name : " + name);
            System.out.println("Account branch : " + branch);
            System.out.println("Account No : " + account_no);
            System.out.println("Account Balance : " + account_balance);


        }
    }

        class bank_account{
            public static void main(String args[]){
                Account bank = new Account();
                bank.getAccount();

            }
        }



