class Solution {
    public int reverse(int x) {
        int reverseNum=0;

       int z = (x<0)?-x:x; 
       
        while(z>0){
            int remainder=z%10;


            //To check the overflow condition for the Maximum range
            if(reverseNum>Integer.MAX_VALUE /10 || (reverseNum==Integer.MAX_VALUE/10 && remainder>7)){
                return 0;
            }

            //TO check the underflow condition for the Minimum range
            else if(reverseNum<Integer.MIN_VALUE/10  || (reverseNum==Integer.MIN_VALUE/10 && remainder<-8)){
                return 0;
            }


            reverseNum = reverseNum*10+remainder;
             z=z/10;
        }

        if(x<0){
            return -reverseNum;
        }
        
        return reverseNum;
    }
}