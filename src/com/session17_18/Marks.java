package session17_18;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private int mark1, mark2, mark3;

    public A(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    double getPercentage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }
}

class B extends Marks {
    private int mark1, mark2, mark3, mark4;

    public B(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    double getPercentage() {
        return (mark1 + mark2 + mark3 + mark4) / 4.0;
    }
}

class TestMarks {
    public static void main(String[] args) {
        Marks studentA = new A(80, 90, 85);
        Marks studentB = new B(70, 75, 80, 85);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}

