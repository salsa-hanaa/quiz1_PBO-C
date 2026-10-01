# Represents a complex number a + bi and the arithmetic operations on it:
#   add:      (a+bi) + (c+di) = (a+c) + (b+d)i
#   subtract: (a+bi) - (c+di) = (a-c) + (b-d)i
#   multiply: (a+bi) * (c+di) = (ac-bd) + (ad+bc)i
class Q13ComplexNumber:
    def __init__(self, real, imaginary):
        self.real = real
        self.imaginary = imaginary

    def add(self, other):
        return Q13ComplexNumber(self.real + other.real, self.imaginary + other.imaginary)

    def subtract(self, other):
        return Q13ComplexNumber(self.real - other.real, self.imaginary - other.imaginary)

    def multiply(self, other):
        new_real = self.real * other.real - self.imaginary * other.imaginary
        new_imaginary = self.real * other.imaginary + self.imaginary * other.real
        return Q13ComplexNumber(new_real, new_imaginary)

    def __str__(self):
        return f"{self.real} + {self.imaginary}i"


if __name__ == "__main__":
    real1 = float(input("Real bilangan pertama: "))
    imaginary1 = float(input("Imajiner bilangan pertama: "))
    real2 = float(input("Real bilangan kedua: "))
    imaginary2 = float(input("Imajiner bilangan kedua: "))

    c1 = Q13ComplexNumber(real1, imaginary1)
    c2 = Q13ComplexNumber(real2, imaginary2)
    print(f"c1: {c1}")
    print(f"c2: {c2}")
    print(f"Addition: {c1.add(c2)}")
    print(f"Subtraction: {c1.subtract(c2)}")
    print(f"Multiplication: {c1.multiply(c2)}")
