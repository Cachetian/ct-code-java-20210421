import java.util.ArrayList;
public class Case1_BigAdd {
    public static void main(String[] args) {
        String input1 = "999";
        String input2 = "89";
        ArrayList<Integer> resultIntArray = new ArrayList<>();
        int input1Len = input1.length();
        int input2Len = input2.length();
        int resultLen = (input1Len > input2Len ? input1Len : input2Len) + 1;
        int upLevelValue = 0;
        int idxLoop = 0;
        int idx1 = input1Len - 1;
        int idx2 = input2Len - 1;
        while (idxLoop <= resultLen) {
            int input1CurrLevelValue = 0;
            if (idxLoop < input1.length()) {
                input1CurrLevelValue = Integer.valueOf(String.valueOf(input1.charAt(idx1)));
                idx1--;
            }
            int input2CurrLevelValue = 0;
            if (idxLoop < input2.length()) {
                input2CurrLevelValue = Integer.valueOf(String.valueOf(input2.charAt(idx2)));
                idx2--;
            }
            int currLevelSum = input1CurrLevelValue + input2CurrLevelValue + upLevelValue;
            if (currLevelSum >= 10) {
                upLevelValue = 1;
            } else {
                upLevelValue = 0;
            }
            int resultCurrLevelValue = currLevelSum % 10;
            resultIntArray.add(resultCurrLevelValue);
            idxLoop++;
        }
        boolean lead0 = true;
        for (int j = resultIntArray.size() - 1; j >= 0; j--) {
            if (lead0 && resultIntArray.get(j).toString().equals("0")) {
                continue;
            }
            if (lead0 && !resultIntArray.get(j).toString().equals("0")) {
                lead0 = false;
            }
            System.out.print(resultIntArray.get(j).toString());
        }
    }
}
