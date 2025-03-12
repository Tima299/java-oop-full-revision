package sg.edu.ntu.chapterThree.threeOne;

public class MyComplex {
    private double real;
    private double imag;
    private static final double EPSILON = 1e-8;

    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        return Math.abs(imag) < EPSILON;
    }

    public boolean isImaginary() {
        return Math.abs(real) < EPSILON;
    }

    public boolean equals(double real, double imag) {
        return Math.abs(this.real - real) < EPSILON && Math.abs(this.imag - imag) < EPSILON;
    }

    public boolean equals(MyComplex another) {
        return Math.abs(this.real - another.real) < EPSILON && Math.abs(this.imag - another.imag) < EPSILON;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        double tempReal = this.real;
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = tempReal * right.imag + this.imag * right.real;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double tempReal = this.real;
        this.real = (this.real * right.real + this.imag * right.imag) / (right.real * right.real + right.imag * right.imag);
        this.imag = (this.imag * right.real - tempReal * right.imag) / (right.real * right.real + right.imag * right.imag);
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }
}
