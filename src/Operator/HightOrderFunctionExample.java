package Operator;

public class HightOrderFunctionExample {
    static void main() {
        Operator operator = new Operator();

        OperatorAction CreditCardAction =  () -> System.out.println("Operator asking: u want buy credit card?");
        OperatorAction phone =  () -> System.out.println("Operator asking: u want buy phone");
        OperatorAction socialSurvery = () -> {
            System.out.println("Operator asking: u have 18 y.o?");
            System.out.println("Operator asking: u have a dog");
        };
        operator.call(CreditCardAction);
        operator.call(phone);
        operator.call(socialSurvery);
    }


}
