package Operator;
//функция высшего порядка
public class Operator {
    public void call(OperatorAction operatorAction)
    {
        System.out.println("Operator start");
        operatorAction.action();
        System.out.println("operator end");

    }
}
