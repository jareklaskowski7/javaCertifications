//	Sun Certified Java Programmer
//	Chapter 9; P729
//  Threads

class Account {
    private int balance = 50;
    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
