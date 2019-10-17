package gates;

public class AndGate {
    private int A;
    private int B;

    public AndGate() {
    }

    public AndGate(int A, int B) {
        this.A = A;
        this.B = B;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    private int getOutput(int A, int B) {
        if (A == 0 | B == 0) {
            return 0;
        } else
            return 1;
    }
    private void printOutput(int A, int B) {
        if (A == 0 | B == 0) {
            System.out.println("0");
        } else
            System.out.println("1");
    }

    public void printTruthTable() {
        System.out.println("----Truth Table for AndGate----");
        if (A == 0 | B == 0) {
            System.out.println(A + " AND " + B + " results  0");
        } else
            System.out.println(A + " AND " + B + " results  1");

    }
}
