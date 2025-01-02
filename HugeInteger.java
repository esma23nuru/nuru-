import java.util.Arrays;

public class HugeInteger {
    private int[] digits;

    // Constructor
    public HugeInteger(String number) {
        digits = new int[40];
        input(number);
    }

    // Method to input a number
    public void input(String number) {
        Arrays.fill(digits, 0); // Clear the array
        int length = number.length();
        for (int i = 0; i < length; i++) {
            digits[40 - length + i] = number.charAt(i) - '0';
        }
    }

    // Method to output the number as a string
    public String output() {
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (int digit : digits) {
            if (leadingZero && digit == 0) {
                continue;
            }
            leadingZero = false;
            sb.append(digit);
        }
        return leadingZero ? "0" : sb.toString();
    }

    // Method to add two HugeIntegers
    public HugeInteger add(HugeInteger other) {
        HugeInteger result = new HugeInteger("0");
        int carry = 0;
        for (int i = 39; i >= 0; i--) {
            int sum = this.digits[i] + other.digits[i] + carry;
            result.digits[i] = sum % 10;
            carry = sum / 10;
        }
        return result;
    }

    // Method to subtract two HugeIntegers
    public HugeInteger subtract(HugeInteger other) {
        HugeInteger result = new HugeInteger("0");
        int borrow = 0;
        for (int i = 39; i >= 0; i--) {
            int diff = this.digits[i] - other.digits[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits[i] = diff;
        }
        return result;
    }

    // Predicate methods for comparison
    public boolean isEqualTo(HugeInteger other) {
        return Arrays.equals(this.digits, other.digits);
    }

    public boolean isNotEqualTo(HugeInteger other) {
        return !Arrays.equals(this.digits, other.digits);
    }

    public boolean isGreaterThan(HugeInteger other) {
        for (int i = 0; i < 40; i++) {
            if (this.digits[i] > other.digits[i]) return true;
            if (this.digits[i] < other.digits[i]) return false;
        }
        return false;
    }

    public boolean isLessThan(HugeInteger other) {
        return other.isGreaterThan(this);
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger other) {
        return isGreaterThan(other) || isEqualTo(other);
    }

    public boolean isLessThanOrEqualTo(HugeInteger other) {
        return isLessThan(other) || isEqualTo(other);
    }

    public boolean isZero() {
        for (int digit : digits) {
            if (digit != 0) return false;
        }
        return true;
    }

    // Main method to test the HugeInteger class
    public static void main(String[] args) {
        HugeInteger num1 = new HugeInteger("1234567890123456789012345678901234567890");
        HugeInteger num2 = new HugeInteger("9876543210987654321098765432109876543210");

        System.out.println("Num1: " + num1.output());
        System.out.println("Num2: " + num2.output());

        HugeInteger sum = num1.add(num2);
        System.out.println("Sum: " + sum.output());

        HugeInteger diff = num1.subtract(num2);
        System.out.println("Difference: " + diff.output());

        System.out.println("Num1 is equal to Num2: " + num1.isEqualTo(num2));
        System.out.println("Num1 is not equal to Num2: " + num1.isNotEqualTo(num2));
        System.out.println("Num1 is greater than Num2: " + num1.isGreaterThan(num2));
        System.out.println("Num1 is less than Num2: " + num1.isLessThan(num2));
        System.out.println("Num1 is greater than or equal to Num2: " + num1.isGreaterThanOrEqualTo(num2));
        System.out.println("Num1 is less than or equal to Num2: " + num1.isLessThanOrEqualTo(num2));
        System.out.println("Num1 is zero: " + num1.isZero());
    }
}