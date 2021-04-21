public class Case2_KMP {
    public static void main(String[] args) {
        String input = "abcdddef";
        String currChar = "";
        String lastChar = null;
        int duplicateCount = 0;
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            currChar = String.valueOf(input.charAt(i));
            if (lastChar != null) {
                if (currChar.equals(lastChar)) {
                    duplicateCount ++;
                }
                if (!currChar.equals(lastChar)) {
                    if (duplicateCount == 0) {
                        result = result + lastChar;
                    } else {
                        duplicateCount = 0;
                    }
                }
            }
            lastChar = currChar;
        }
        if (duplicateCount == 0) {
            result += currChar;
        }
        System.out.println(result);
    }
}
