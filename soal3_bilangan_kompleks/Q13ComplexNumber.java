// Represents a complex number a + bi and the arithmetic operations on it:
//   add:      (a+bi) + (c+di) = (a+c) + (b+d)i
//   subtract: (a+bi) - (c+di) = (a-c) + (b-d)i
//   multiply: (a+bi) * (c+di) = (ac-bd) + (ad+bc)i
public class Q13ComplexNumber {
    private double real;
    private double imaginary;

    public Q13ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() { return real; }
    public double getImaginary() { return imaginary; }

    public Q13ComplexNumber add(Q13ComplexNumber other) {
        return new Q13ComplexNumber(this.real + other.getReal(), this.imaginary + other.getImaginary());
    }

    public Q13ComplexNumber subtract(Q13ComplexNumber other) {
        return new Q13ComplexNumber(this.real - other.getReal(), this.imaginary - other.getImaginary());
    }

    public Q13ComplexNumber multiply(Q13ComplexNumber other) {
        double newReal = this.real * other.getReal() - this.imaginary * other.getImaginary();
        double newImaginary = this.real * other.getImaginary() + this.imaginary * other.getReal();
        return new Q13ComplexNumber(newReal, newImaginary);
    }

    public String toString() { return real + " + " + imaginary + "i"; }
}
