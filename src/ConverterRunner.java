import java.util.Scanner;

class ConverterRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Converter!");
        System.out.println("--------------------------------");
        System.out.print("Enter the base of your number (2, 8 or 10): ");

        Scanner s = new Scanner(System.in);
        int base = 0;
        while (true) {
            String choice = s.nextLine();
            if (choice.equals("2") || choice.equals("8") || choice.equals("10")) {
                base = Integer.parseInt(choice);
                break;
            } else {
                System.out.print("Invalid input. Please enter 2, 8, or 10: ");
            }
        }

        System.out.print("Enter your number: ");
        String number = s.nextLine();

        if (base == 2){
            if (number.equals("2") || number.equals("3") || number.equals("4") || number.equals("5") || number.equals("6") || number.equals("7") || number.equals("8") || number.equals("9")){
                System.out.print("Invalid number. Please enter a valid number: ");
                number = s.nextLine();
            }
        }

        s.close();

        NumberConverter nc = new NumberConverter(Integer.parseInt(number, base), base);
        System.out.println("\nBinary number: " + nc.convertToBinary());
        System.out.println("Octal number: " + nc.convertToOctal());
    }

}