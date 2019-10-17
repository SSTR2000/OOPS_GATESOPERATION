package gates;

public class OrGate {
    private int A;
    private int B;

    public OrGate() {
    }

    public OrGate(int A, int B) {
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
        if (A == 1 | B == 1) {
            return 1;
        } else
            return 0;
    }

    private void printOutput(int A, int B) {
        if (A == 1 | B == 1) {
            System.out.println("1");
        } else
            System.out.println("0");
    }

    public void printTruthTable() {
        System.out.println("----Truth Table for OrGate----");
        System.out.println("0" + " OR " + "0" + " results  0");
        System.out.println("0" + " OR " + "1" + " results  1");
        System.out.println("1" + " OR " + "0" + " results  1");
        System.out.println("1" + " OR" + "1" + " results  1");
    }
}
