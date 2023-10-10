package HW_05_10_2023.numer1;

public class StringUtils {
    private StringUtils() {
    }
    public static String generateWord(int length){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) ('a' + (int) (Math.random() * 50)));
        }
        return sb.toString();
    }
    public static String generateNumeric(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((int) (Math.random() * 24));
        }
        return sb.toString();
    }

    public static String[] splitByFirst(String input) {
        String[] result = new String[2];
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                index = i;
                break;
            }
        }
        result[0] = input.substring(0, index);
        result[1] = input.substring(index + 1);
        return result;
    }

    public static boolean isNumeric(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
