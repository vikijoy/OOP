package Models;

import DZJOOP5.ComplexNum;
import DZJOOP5.ModelC;
public class SumModelC implements ModelC {

    public ComplexNum setComplexNum(double a, double b) {
        return new ComplexNum(a, b);
    }

    public ComplexNum result(ComplexNum a, ComplexNum b) {
        return new ComplexNum(a.getrPart() + b.getrPart(), a.getiPart() + b.getiPart());
    }
}