package Models;

import DZJOOP6.ComplexNum;

public class DivideModelC extends SumModelC{

    @Override
    public ComplexNum result(ComplexNum a, ComplexNum b) {
        double z = b.getiPart()*b.getiPart() + b.getrPart()*b.getrPart();
        if (z==0) {
            System.out.println("Выполнение деления этих комплексных чисел невозможно");
            return new ComplexNum(0,0);
        }
        double x = (a.getrPart()*b.getrPart()+a.getiPart()*b.getiPart())/z;
        double y = (a.getiPart()*b.getrPart() - a.getrPart()*b.getiPart())/z;
        return new ComplexNum(x,y);

    }
}