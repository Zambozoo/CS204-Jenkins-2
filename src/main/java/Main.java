import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while(scanner.hasNext()) {
            switch(scanner.next()) {
                case "add":
                    System.out.println(calculator.add(scanner.nextInt(),scanner.nextInt()));
                    break;
                case "sub":
                    System.out.println(calculator.subtract(scanner.nextInt(),scanner.nextInt()));
                    break;
                case "mul":
                    System.out.println(calculator.multiply(scanner.nextInt(),scanner.nextInt()));
                    break;
                case "div":
                    System.out.println(calculator.divide(scanner.nextInt(),scanner.nextInt()));
                    break;
                case "fib":
                    System.out.println(calculator.fibonacciNumberFinder(scanner.nextInt()));
                    break;
                case "bin":
                    System.out.println(calculator.intToBinaryNumber(scanner.nextInt()));
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
}