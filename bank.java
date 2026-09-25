class Bank{ // Bank code starts here
    private int customer_id;
    protected int account_num;
    String ifsc_code;
    static int min_balance = 5000;

    Bank(int customer_id, int account_num, String ifsc_code){
        this.account_num = account_num;
        this.customer_id = customer_id;
        this.ifsc_code = ifsc_code;
    }

    public void show_customer_id(){
        System.out.println("This customer has an id : " + customer_id);
    }

    public void show_account_number(){
        System.out.println("The customer with id " + customer_id + " has account no " + account_num);
    }

    public void show_min_bal(){
        System.out.println("The min balance for this account is " + min_balance);
    }

    public void show_ifsc_code(){
        System.out.println("The ifcs code of the branch this account is situated is " + ifsc_code);
    }

    public static void main(String args[]){


        Bank customer = new Bank(111111, 88821, "KGB9999");

        customer.show_account_number();
        customer.show_customer_id();
        customer.show_ifsc_code();
        customer.show_min_bal();
    }
}