package leetcode.problems;

/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.

Example 1:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.

Example 2:
Input: x = 3, y = 1
Output: 1
*/
class HammingDistance {
    // Runtime: 0 ms, faster than 100.00%
    public int hammingDistance(int x, int y) {
        int answer = 0;
        int xor = x ^ y;
        
        while (xor != 0) {
            if (xor % 2 != 0)
                answer++;
            xor /= 2;
        }
        
        return answer;
    }
}
