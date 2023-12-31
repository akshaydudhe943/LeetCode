class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int r;
        int sum = 0;

        while(num>0)
        {
            r = num % 10;
            sum = (sum*10) + r;
            num=num/10;
        }
        if(x == sum)
            return true;
        else
            return false;
    }
}