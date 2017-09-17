package com.capgemini.se;

public class PolymorphismExample {

    protected String name;

    public PolymorphismExample(String name) {
        this.name = name;
    }

    static class BusinessCustomer extends PolymorphismExample {
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
        PolymorphismExample c = new PolymorphismExample("S.Oudmaijer");
        PolymorphismExample b = new BusinessCustomer("B.Izzyness", "123456");
        c.printInfo();
        b.printInfo();
    }
}
