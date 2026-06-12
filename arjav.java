class Bank{
    String bank_name;
    String bank_branch;
    double bank_balance;
    String bank_holder_name;
    int bank_id;

    Bank(String bank_name, String bank_branch,
         double bank_balance, String bank_holder_name,
         int bank_id){

        this.bank_name = bank_name;
        this.bank_branch = bank_branch;
        this.bank_balance = bank_balance;
        this.bank_holder_name = bank_holder_name;
        this.bank_id = bank_id;
    }
}

public class arjav {
    public static void main(String[] args){

    
        Bank b1 = new Bank(
                "IDBI",
                "Orai",
                1000,
                "Arjav",
                1043
        );

        System.out.println(
                b1.bank_name + " " +
                b1.bank_branch + " " +
                b1.bank_balance + " " +
                b1.bank_holder_name + " " +
                b1.bank_id
        );
    }
}
