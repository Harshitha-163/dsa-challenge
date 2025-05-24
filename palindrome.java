<<<<<<< HEAD
class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int revNum=0;
        if(x<0){
            return false;

        }
        
        while(n>0){
        int d =n%10;
        revNum=revNum*10+d;
        n=n/10;
    }
    if(revNum==x){
        return true;

    }
    else{
        return false;
    }
        
    }
=======
class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int revNum=0;
        if(x<0){
            return false;

        }
        
        while(n>0){
        int d =n%10;
        revNum=revNum*10+d;
        n=n/10;
    }
    if(revNum==x){
        return true;

    }
    else{
        return false;
    }
        
    }
>>>>>>> 5a927664f3e6a43fb3c7c6b4b9da20e5f1598595
}