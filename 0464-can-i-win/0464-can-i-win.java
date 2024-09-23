import java.util.Map;
import java.util.HashMap;
class Solution {
    private Map<Integer, Boolean> memo = new HashMap<>();
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int sumOfAllIntegers = (1 + maxChoosableInteger) * maxChoosableInteger / 2;
        if (sumOfAllIntegers < desiredTotal) {
            return false;
        }
        return depthFirstSearch(0, 0, maxChoosableInteger, desiredTotal);
    }
    private boolean depthFirstSearch(int usedNumbersState, int currentTotal, int maxChoosableInteger, int desiredTotal) {
        if (memo.containsKey(usedNumbersState)) {
            return memo.get(usedNumbersState);
        }
        boolean canWin = false;
        for (int i = 1; i <= maxChoosableInteger; ++i) {
            if (((usedNumbersState >> i) & 1) == 0) {
                if (currentTotal + i >= desiredTotal
                    || !depthFirstSearch(usedNumbersState | (1 << i), currentTotal + i, maxChoosableInteger, desiredTotal)) {
                    canWin = true;
                    break;
                }
            }
        }
        memo.put(usedNumbersState, canWin);
        return canWin;
    }
}
