class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int result = 0;
        while (left != right) {
            left = left >> 1;
            right = right >> 1;
            result += 1;
        }
        return right << result;
    }
}