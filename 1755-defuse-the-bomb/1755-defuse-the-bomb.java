class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        int sum = 0;
        int i = 0;
        if (k > 0) {
            int j = i + 1;
            while (i < n) {
                sum += code[j % n];
                if (j - i < k) {
                    j++;
                }
                else if (j - i == k) {
                    result[i] = sum;
                    sum -= code[(j - k + 1) % n];
                    i++;
                    j++;
                }
            }
        }
        else if (k < 0) {
            int j = n + (i - Math.abs(k));
            while (i < n) {
                sum += code[j];
                if (j != i) {
                    j = ++j % n;
                }
                if (j == i) {
                    result[i] = sum;
                    sum -= code[(n + (j - Math.abs(k))) % n];
                    i++;
                }
            }
        }
        return result;  
    }
}