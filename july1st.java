public class july1st{

    class Solution {
        public int arrangeCoins(int n) {
            int i = 1;
            int count = 0;
            
            while(n>=i){
                n-=i;
                i++;
                count++;
            }
            
            return count;
        }
    }
}