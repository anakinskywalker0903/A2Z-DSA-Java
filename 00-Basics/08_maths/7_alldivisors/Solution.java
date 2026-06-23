class Solution {
    public int[] divisors(int n) {
        ArrayList<Integer> output = new ArrayList<>();
        for(int i = 1;i <= n ;i++){
                if(n%i==0){
                    output.add(i);}
    }
        int[] result = new int[output.size()];
        for(int i = 0; i < output.size(); i++) {
            result[i] = output.get(i);}
        return result;}
}