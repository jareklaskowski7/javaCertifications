//	Sun Certified Java Programmer
//	Chapter 5, P330
//  Flow Control, Exceptions, and Assertions

class Tester330 {
    int x;

    Tester330() {
        System.out.println("Tester330()");
        x = 0;
    }

    public void buyProduct() {
        System.out.println("buy product");
    }

    public void dontBuyProduct() {
        System.out.println("don't buy product");
    }

    public void getApproval() {
        System.out.println("get approval");
    }

    public static void main(String[] args) {
        Tester330 t = new Tester330();
        int price = t.x;

        for (price = 100; price < 500; price = price + 100) {
            if (price < 300) {
                t.buyProduct();
            } else {
                if (price < 400) {
                    t.getApproval();
                } else {
                    t.dontBuyProduct();
                }
            }
        }
    }
}
