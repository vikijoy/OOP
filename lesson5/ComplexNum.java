package lesson5;
public class ComplexNum {
    double rPart;
    double iPart;

    public ComplexNum(double rPart, double iPart) {
        this.rPart = rPart;
        this.iPart = iPart;
    }

    public double getrPart() {
        return rPart;
    }

    public double getiPart() {
        return iPart;
    }

    public void setrPart(double rPart) {
        this.rPart = rPart;
    }

    public void setiPart(double iPart) {
        this.iPart = iPart;
    }

    @Override
    public String toString() {
        if (iPart>0)
        return"("+
               rPart + "+" + iPart + "i)";
        return"("+
                rPart + "-" + (-1)*iPart + "i)";
    }
}