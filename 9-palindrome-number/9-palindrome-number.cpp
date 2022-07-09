class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0)) return false;
        int digit,temp;
        long ans=0;
        temp=x;
        while(x>0){
            digit = x % 10;
            ans = (ans*10) + digit;
            x = x/10;
        }
            return ans==temp || x==ans/10  ;         
        }  
};