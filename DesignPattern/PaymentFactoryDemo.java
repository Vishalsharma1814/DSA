package DesignPattern;

interface PaymentMethod {
    void pay();
}

class UPIPayemnt implements PaymentMethod {
    public void pay() {
        System.out.println("Paid by UPI");
    }
}

class CardPayment implements PaymentMethod {
    public void pay() {
        System.out.println("Paid by Card");
    }
}

class PaymentFactory {
    public static PaymentMethod getPayment(String type) {
        switch (type.toUpperCase()) {
            case "UPI":
                return new UPIPayemnt();
            case "CARD":
                return new CardPayment();
            default:
                throw new IllegalArgumentException("Unsupported payment type: " + type);
        }
    }
}

public class PaymentFactoryDemo {
    public static void main(String[] args) {
        PaymentMethod upiPayment = PaymentFactory.getPayment("UPI");
        upiPayment.pay();

        PaymentMethod cardPayment = PaymentFactory.getPayment("CARD");
        cardPayment.pay();
    }
}