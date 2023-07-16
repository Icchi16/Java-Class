import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-------Choose an option-------");
            System.out.println("1------Decimal to Binary");
            System.out.println("2------Binary to Decimal");
            System.out.println("3------Decimal to Hexadecimal");
            System.out.println("4------Hexadecimal to Decimal");
            System.out.println("5------Exit program");
            System.out.println("--------End of option---------");

            Integer option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1: {
                    System.out.println("Input the number (integer only! Too stupid to do extra)");
                    Integer input = Integer.parseInt(scanner.nextLine());
                    decimalToBinary(input);
                    break;
                }
                case 2: {
                    System.out.println("Input the number");
                    String input = scanner.nextLine();
                    binaryToDecimal(input);
                    break;
                }
                case 3: {
                    System.out.println("Input the number (integer only! Too stupid to do extra)");
                    Integer input = Integer.parseInt(scanner.nextLine());
                    decimalToHexadecimal(input);
                    break;
                }
                case 4: {
                    System.out.println("Input the number");
                    String input = scanner.nextLine();
                    hexadecimalToDecimal(input);
                    break;
                }
                case 5: {
                    System.exit(0);
                }
            }
        }
    }

    public static void decimalToBinary(Integer input) {
        int orgInput = input;
        Stack<String> resultStack = new Stack<String>();
        while (input / 2 >= 0) {
            String output = String.valueOf(input % 2);
            resultStack.add(output);
            if (input / 2 == 0) {
                break;
            } else input /= 2;
        }
        toString(orgInput, resultStack, true);
    }

    public static void binaryToDecimal(String input) {
        Integer resultInt = 0;
        char[] stringArr = input.toCharArray();
        ArrayList<Integer> binaryArr = new ArrayList<>();

        for (char binaryChar : stringArr
        ) {
            binaryArr.add(Integer.parseInt(String.valueOf(binaryChar)));
        }

        for (int i = 0; i < binaryArr.size() - 1; i++) {
            resultInt = (i == 0 ? binaryArr.get(i) * 2 : resultInt * 2) + binaryArr.get(i + 1);
        }
        System.out.println(input + " to Decimal is: " + resultInt);
    }

    public static void toString(Integer input, Stack<String> inputStack,boolean toBinary) {
        System.out.print(input + (toBinary? " to Binary ":" to Hexadecimal ") + "is: ");
        while (inputStack.size() > 0) {
            System.out.print(inputStack.pop());
        }
        System.out.println();
        System.out.println("-------------------");
    }

    public static void decimalToHexadecimal(Integer input) {
        int orgInput = input;
        Stack<String> resultStack = new Stack<String>();
        while (input / 16 >= 0) {
            String output;
            switch (input % 16) {
                case 15: {
                    output = "f";
                    break;
                }
                case 14: {
                    output = "e";
                    break;
                }
                case 13: {
                    output = "d";
                    break;
                }
                case 12: {
                    output = "c";
                    break;
                }
                case 11: {
                    output = "b";
                    break;
                }
                case 10: {
                    output = "a";
                    break;
                }
                default:
                    output = String.valueOf((input % 16));
                    break;
            }
            resultStack.add(output);
            if (input / 16 == 0) {
                break;
            } else input = input / 16;
        }
        toString(orgInput, resultStack, false);
    }

    public static void hexadecimalToDecimal(String input) {
        int resultInt = 0;
        char[] stringArr = input.toLowerCase().toCharArray();
        ArrayList<Integer> hexaArr = new ArrayList<Integer>();
        for (char stringChar : stringArr
        ) {
            int converted;
            switch (stringChar) {
                case 'f': {
                    converted = 15;
                    break;
                }
                case 'e': {
                    converted = 14;
                    break;
                }
                case 'd': {
                    converted = 13;
                    break;
                }
                case 'c': {
                    converted = 12;
                    break;
                }
                case 'b': {
                    converted = 11;
                    break;
                }
                case 'a': {
                    converted = 10;
                    break;
                }
                default: {
                    converted = Integer.parseInt(String.valueOf(stringChar));
                    break;
                }
            }
            hexaArr.add(converted);
        }

        for (int i = 0; i < hexaArr.size() - 1; i++) {
            resultInt = (i == 0 ? hexaArr.get(i) * 16 : resultInt * 16) + hexaArr.get(i + 1);
        }
        System.out.println(input + " to Decimal is: " + resultInt);
    }
}