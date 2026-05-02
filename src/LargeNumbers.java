public class LargeNumbers {

    public static String multiplyStrings(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) return "0";

        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < result.length && result[i] == 0) i++;
        for (; i < result.length; i++) sb.append(result[i]);

        return sb.toString();
    }

    public static void main(String[] args) {
        String num1 = "123456789123456789";
        String num2 = "987654321987654321";

        System.out.println("Product: " + multiplyStrings(num1, num2));
    }
}
