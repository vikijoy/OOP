package lesson6;
import Models.SumModel;

public class Presenter {
    View view;
    SumModel model;
    String log;

    public Presenter(SumModel sumModel, View v) {
        model = sumModel;
        view = v;
    }

    public void buttonClick(String operation){
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        double result = model.result();
        log = a + operation + b + " = " + result;
        view.print( log);
    }

}