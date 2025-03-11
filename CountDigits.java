class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count=0,temp=n;
        if(n==0){
            return 1;
        }
        
        while(n>0){
            int a = n%10;
            if(a!=0 && temp%a==0){
                count++;
            }
            n=n/10;
        }
        
        return count;
    }
    
}