package sg.edu.ntu.chapterThree.threeTwo;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree(){
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            if (coeffs[i] == 0) continue; // Skip zero coefficients

            if (sb.length() > 0) {
                sb.append(" + "); // Add plus sign between terms
            }

            if (i == 0) {
                sb.append(coeffs[i]); // Constant term
            } else if (i == 1) {
                sb.append(coeffs[i]).append("x"); // Linear term
            } else {
                sb.append(coeffs[i]).append("x^").append(i); // Higher-order terms
            }
        }
        return sb.toString();
    }

    public double evaluate(double x){
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }
    public MyPolynomial add(MyPolynomial right){
        int newDegree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[newDegree + 1];
        for (int i = 0; i < newCoeffs.length; i++) {
            if (i <= this.getDegree()) {
                newCoeffs[i] += this.coeffs[i];
            }
            if (i <= right.getDegree()) {
                newCoeffs[i] += right.coeffs[i];
            }
        }
        return new MyPolynomial(newCoeffs);
    }
    public MyPolynomial multiply(MyPolynomial right){
        double[] newCoeffs = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }
}
