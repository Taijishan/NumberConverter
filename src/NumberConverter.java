public class NumberConverter {
    int[] digits;
    int base;

    public NumberConverter(int number, int base) {
        String numberAsString = Integer.toString(number);
        digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            String single = numberAsString.substring(i, i + 1);
            int d = Integer.parseInt(single);
            digits[i] = d;
        }
        this.base = base;
    }

    public String displayOriginalNumber() {
        StringBuilder o = new StringBuilder();
        for (int digit : digits) {
            o.append(digit);
        }
        o.append("\n");
        return o.toString();
    }

    public int[] getDigits() {
        return digits;
    }

    public int convertToDecimal() {
        int decimal = 0;
        int power = digits.length - 1;
        for (int digit : digits) {
            decimal += digit * Math.pow(base, power);
            power--;
        }
        return decimal;
    }

    public String convertToBinary() {
        int decimal = convertToDecimal();
        StringBuilder bin = new StringBuilder();
        while (decimal > 0){
            bin.insert(0, decimal % 2);
            decimal /= 2;
        }
        return bin.toString();
    }

    public String convertToOctal() {
        int decimal = convertToDecimal();
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            octal.insert(0, decimal % 8);
            decimal /= 8;
        }
        return octal.toString();
    }
}