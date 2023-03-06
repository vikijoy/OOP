package Models;

public class DeductModel extends SumModel {
    @Override
    public double result() {
        return x - y;
    }
}