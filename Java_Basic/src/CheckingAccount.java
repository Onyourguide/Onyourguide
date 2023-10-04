public class CheckingAccount extends Account { /* lab5 */
    private double credit;

    public CheckingAccount(){
        super(0,"");
        credit = 0;
    }

    public CheckingAccount(double balance, String name, double credit){
        super(balance,name);
        this.credit = credit;
    }

    public void  setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return credit;
    }
    public void withdraw(double a){
        double totalBalance = balance + credit;

        if (a > 0 && (totalBalance - a) >= 0) {
            if (balance >= a) {
                balance -= a;
            } else {
                credit = totalBalance - a;
                balance = 0;
            }
            System.out.println(a + " baht is withdrawn from " + name);
        } else {
            if (a < 0) {
                System.out.println("The" + name + "account has" + balance + "baht and" + credit + "credits.");
            } else {
                System.out.println("Not enough money!");
            }
        }
    }
    public void withdraw(int a){
        withdraw((double) a);
    }
    public String toString() {
        return "The" + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
