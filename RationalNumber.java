
public class RationalNumber {
    private int myNum;
    private int myDenom;
    private static int numGrowthFractions = 0;
    private static int numDecayFractions = 0;

    public RationalNumber(int num, int denom) {

        myNum = num;
        myDenom = denom;
        if (myNum > myDenom) {
            numGrowthFractions++;
        }
        if (myNum < myDenom) {
            numDecayFractions++;
        }

    }

    public RationalNumber() {
        myNum = 1;
        myDenom = 1;

    }

    public static int getNumGrowthFractions() {
        return numGrowthFractions;
    }

    public static int getNumDecayFractions() {
        return numDecayFractions;
    }

    public int getNum() {
        return myNum;
    }

    public int getDenom() {
        return myDenom;
    }

    public void setNum(int num) {
        myNum = num;
    }

    public void setDenom(int de) {
        myDenom = de;
    }

    public RationalNumber reciprocal() {
        int denom = this.getNum();
        int num = this.getDenom();

        return new RationalNumber(num, denom);
    }

    public RationalNumber multiply(RationalNumber second) {
        int var1num = this.getNum();
        int var1denom = this.getDenom();
        int var2num = second.getNum();
        int var2denom = second.getDenom();

        return new RationalNumber((var1num * var2num), (var1denom * var2denom));

    }

    public RationalNumber divide(RationalNumber r) {
        int var1num = this.getNum();
        int var1denom = this.getDenom();
        int var2num = r.reciprocal().getNum();
        int var2denom = r.reciprocal().getDenom();

        return new RationalNumber((var1num * var2num), (var1denom * var2denom));

    }

    public RationalNumber add(RationalNumber r) {
        int commondenom = this.getDenom() * r.getDenom();
        int var1num = this.getNum() * r.getDenom();
        int var2num = r.getNum() * this.getDenom();
        int numresult = var1num + var2num;
        int denomresult = commondenom;

        return new RationalNumber(numresult, denomresult);

    }

    public RationalNumber subtract(RationalNumber r) {
        int commondenom = this.getDenom() * r.getDenom();
        int var1num = this.getNum() * r.getDenom();
        int var2num = r.getNum() * this.getDenom();
        int numresult = var1num - var2num;
        int denomresult = commondenom;

        return new RationalNumber(numresult, denomresult);

    }

    public String toString() {

        return this.getNum() + "/" + this.getDenom();
    }

    public RationalNumber reduce() {

        for (int i = 2; i <= 9; i++) {

            if (this.getNum() % i == 0) {
                if (this.getDenom() % i == 0) {
                    setNum(this.getNum() / i);
                    setDenom(this.getDenom() / i);
                    i = i - 1;
                }

            }

        }
        return new RationalNumber(this.getNum(), this.getDenom());
    }

}
