class Solution {
public:
    int reverse(int x) {
        int revNum =0;
        while(x != 0){
            int lastdigit = x % 10;
            x= x/10;
            if (revNum > INT_MAX/10 || revNum < INT_MIN/10) return 0;
            revNum = (revNum * 10)+lastdigit;
        }
        return revNum;
    }
};