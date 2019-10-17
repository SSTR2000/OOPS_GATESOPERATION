package gates;

public class NotGate {
    private int A;
    private int B;

    public NotGate() {
    }

    public NotGate(int A) {
        this.A = A;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    private int getOutput(int A) {
        if (A == 0) {
            return 1;
        } else
            return 0;
    }

    private void printOutput(int A) {
        if (A == 0) {
            System.out.println("1");
        } else
            System.out.println("0");
    }

    public void printTruthTable() {
        System.out.println("----Truth Table for NotGate----");
        if (A == 0)
            System.out.println("NOT" + A + " results " + "1");
        else
            System.out.println("NOT" + A + " results " + "0");
    }
}
