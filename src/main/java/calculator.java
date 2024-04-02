public class calculator {
    int valueA;
    int valueB;
    int total;

    public calculator(int x, int y) {
        this.valueA = x;
        this.valueB = y;
        this.total = 0;
    }

    public void add() {
        this.total = this.valueA + this.valueB;
    }

    public void subtract() {
        this.total = this.valueA - this.valueB;
    }

    public void multiply() {
        this.total = this.valueA * this.valueB;
    }

    public void division() {
        this.total = this.valueA / this.valueB;
    }

    public int getValue() {
        return this.total;
    }

    public void results() {
        System.out.println("Calculated Value: " + this.total);
    }

}
