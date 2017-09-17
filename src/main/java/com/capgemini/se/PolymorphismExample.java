package week1;

public class Customer {

    protected String name;

    public Customer(String name) {
        this.name = name;
    }

    static class BusinessCustomer extends Customer {
        private String kvkNumber;

        public BusinessCustomer(String name, String kvkNumber) {
            super(name);
            this.kvkNumber = kvkNumber;
        }

        @Override
        public void printInfo() {
            System.out.println("BusinessCustomer; name: " + this.name + " kvk: " + kvkNumber);
        }
    }

    public void printInfo() {
        System.out.println("name: " + this.name);
    }

    public static void main(String[] args) {
        Customer c = new Customer("S.Oudmaijer");
        Customer b = new BusinessCustomer("B.Izzyness", "123456");
        c.printInfo();
        b.printInfo();
    }
}
