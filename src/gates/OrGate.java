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
        int c = A * B;
        return c;
    }

    private void printOutput(int A, int B) {
        int c = A * B;
        System.out.println(c);
    }

    public void printTruthTable() {
        System.out.println("----Truth Table for OrGate----");
        System.out.println(A + " AND " + B + " results " + A * B);
    }
}
