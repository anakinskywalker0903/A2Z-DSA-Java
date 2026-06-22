class Solution {
    static boolean armstrongNumber(int n) {
        int digit = 0;
        int sum = 0;
        int og = n;
        while(n>0){
            digit = n % 10;
            n = n / 10;
            sum += digit*digit*digit;
        } 
        if(og == sum){
        return true;
        }else {
            return false;
        }
    }
    
}