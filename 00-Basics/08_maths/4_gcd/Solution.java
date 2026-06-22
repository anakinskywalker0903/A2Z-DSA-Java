// Brute Force 

class Solution {
    public int GCD(int n1, int n2) {

        for(int i = Math.min(n1, n2); i >= 1; i--) {

            if(n1 % i == 0 && n2 % i == 0) {
                return i;
            }

        }

        return 1;
    }
}


// Euclidean Algorithm

class Solutionn {
    public int GCD(int n1, int n2) {
        int remainder = 0;
        while(n2 !=0){
            remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;  
        } 
        return n1;
    }
}