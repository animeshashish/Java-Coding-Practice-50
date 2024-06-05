package JavaCodingPractice50;

//  If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
// where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.

// we have to perform only one operation, having same name of the methods


public class Calculator {
    public int add(int a, int b) { // overload add() which takes two int parameters.
        return (a + b);
    }
    public double add(double a, double b) { // overload add() which takes two double parameters.
        return (a + b);
    }
    public String add(String a, String b) { // overload add() which takes two String parameters.
        return (a + b);
    }
public static void main(String[] args) {
        Calculator cal = new Calculator();

    System.out.println("Sum of two int parameter:" + " " + cal.add(5, 10));
    System.out.println("Sum of two double parameter:" + " " + cal.add(5.6, 7.9));
    System.out.println("Add/join two string parameter:" + " " + cal.add("Animesh", "Hemrom"));
}
}
