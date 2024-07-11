package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Masukkan 2 angka dan simbol +, _, *, atau /");
        char operator = 0;
        double firstNum = 0;
        double secondNum = 0;
        try {
            System.out.println("Masukan Angka Pertama :");
            firstNum = scanner.nextDouble();
            System.out.println("Masukan Angka Kedua :");
            secondNum = scanner.nextDouble();
            System.out.println("Masukan Simbol :");
            operator = scanner.next().charAt(0);
            } catch (InputMismatchException ime) {
            System.out.println("Invalid Input");
            } finally {
            if (operator != '+' & operator != '-' & operator !='*' & operator !='/') {
                throw new InputMismatchException();
                }
            Calculation calculation = new Calculation(firstNum, secondNum, operator);
            System.out.println(calculation.makeCalculation());
            }
        }
    }