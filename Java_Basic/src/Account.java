public class Account { /* lab5 */
    protected double balance;
    protected String name;

    public Account (double balance, String name){
        this.balance = balance;
        this.name = name;
        /* คอนสตัคเตอร์เมธอด Account(double balance, String name) จะนําค่าพารามิเตอร์ balance ไป
        กําหนดให้แอททริบิวท์ balance และพารามิเตอร์name ไปกําหนดให้แอททริบิวท์ name */
    }
    public void deposit(double a){
        if (a > 0) {
            balance += a;
            System.out.println(a + " baht is deposited to " + name);
        } else {
            System.out.println("Input number must be a positive integer.");
        }
        /* เมธอด deposit() จะนําค่า a ไปเพิ่มจากแอททริบิวท์ balance (balance + a) ก็ต่อเมื่อ a ต้องมีค่า
        มากกว่า 0 แสดงข้อความ a + " baht is deposited to " + name ถ้าไม่ใช้ให้แสดงข้อความ "Input number must be a positive integer." */
    }
    public void withdraw(double a){
        if (a > 0 && balance - a >= 0) { /* ก็ต่อเมื่อ a ต้องมีค่ามากกว่า 0 และผลลัพธ์ของ balance – a บิวท์ต้องมากกว่า 0 */
            balance -= a;
            System.out.println(a + " baht is withdrawn from " + name);
        } else {
            if (a < 0) {
                System.out.println("Input number must be a positive integer.");
            } else {
                System.out.println("Not enough money!");
            }
        }
    }
    public void setName(String name){
        this.name = name;
        /* เมธอด setName() จะนําค่าพารามิเตอร์name ไปกําหนดให้แอททริบิวท์ name */
    }
    public String getName(){
        return name;
    }

    public double getBalance() {
        return balance;
    }
    public void showAccount(){
        System.out.println(name + " account has " + balance + " baht.");
    }
}
