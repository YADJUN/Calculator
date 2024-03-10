import java.util.Scanner;

public class Solution {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String inputLine = scanner.nextLine();
                System.out.println(calc(inputLine));
            }
            public static String calc(String input) {
                String[] operands = {"+", "-", "*", "/"};
                String[] regexActions = {"\\+", "-", "\\*", "/"};
                int index2 = operandIndex(operands, input);

                String[] split = input.split(regexActions[index2]);
                chekExeptions(split);
                
                
                int[] arrayOperands;
                if (!Converter.isRoman(split[0]) && !Converter.isRoman(split[1])) {
                    arrayOperands = convertStringToArabian(split);
                    return String.valueOf(calculate(operands, index2, arrayOperands));
                }  else {
                    arrayOperands = convertRomanToArabian(split);
                    return Converter.arabToRoman(calculate(operands, index2, arrayOperands));
                }
            }
            public static int[] convertRomanToArabian(String[] split) {
                int[] a = new int[2];
                a[0] = Converter.romanToArab(split[0]);
                a[1] = Converter.romanToArab(split[1]);
                if (a[0] > 10 || a[1] > 10) {
                    throw new RuntimeException("One of the operands is greater than 10");
                }
                return a;
            }
            public static int[] convertStringToArabian(String[] split) {

                int[] a = new int[2];
                a[0] = Integer.parseInt(split[0]);
                a[1] = Integer.parseInt(split[1]);
                if (a[0] > 10 || a[1] > 10) {
                    throw new RuntimeException("One of the operands is greater than 10");
                }
                return a;

            }
            public static int operandIndex(String[] operands, String inputLine) {
                int index;
                for (int i = 0; i < operands.length; i++) {
                    if (inputLine.contains(operands[i])) {
                        index = i;
                        return index;
                    }
                }

                return -1;
            }
            public static int calculate(String[] operands, int index, int[] array) {
                return switch (operands[index]) {
                    case "+" -> array[0] + array[1];
                    case "-" -> array[0] - array[1];
                    case "*" -> array[0] * array[1];
                    default -> array[0] / array[1];
                };
            }
            public static void chekExeptions (String[] split){
            if (split.length > 2){throw new RuntimeException("More than two operands")} 
            if (!Converter.isRoman(split[0]) && Converter.isRoman(split[1])){throw new RuntimeException("invalid arithmetic operation");} 
            if (Converter.isRoman(split[0]) && !Converter.isRoman(split[1])){throw new RuntimeException("invalid arithmetic operation");} 
            }
        }


