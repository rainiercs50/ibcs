import java.util.*;


class RecursiveMethods{
    int dig(int x){
        int y = 0, X = x;
        if(x == 0)
            ++y;
        while(X > 0){
            ++y;
            X /= 10;
        }
        return y;
    }
    int factorial(int n){
        if(n == 1)
            return 1;
        return n * factorial(n-1);
    }
    int sum(int n){
        if(n == 1)
            return 1;
        return n + sum(n-1);
    }
    int pow(int x, int y){
        if(y == 0)
            return 1;
        return x * pow(x, y-1);
    }
    int fib(int n){
        if(n == 1)
            return 0;
        else if(n == 2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }
    void FIB(int n, int i){
        if(i == n+1){}
        else{
            System.out.println(fib(i));
            FIB(n, i+1);
        }
    }
    void FIB(int n){
        FIB(n, 1);
    }
    boolean palstr(String s, int l, int r){
        if(l > r)
            return true;
        if(s.charAt(l) != s.charAt(r))
            return false;
        else
            return palstr(s, l+1, r-1);
    }
    boolean palstr(String s){
        return palstr(s, 0, s.length()-1);
    }
    int numidx(int x, int idx){
        int y = dig(x);
        while(y != idx){
            --y;
            x /= 10;
        }
        return x % 10;
    }
    boolean palint(int x, int l, int r){
        if(l > r)
            return true;
        if(numidx(x, l) != numidx(x, r))
            return false;
        else
            return palint(x, l+1, r-1);
    }
    boolean palint(int x){
        return palint(x, 1, dig(x));
    }
   
}
public class somejava{
    public static void main(String args[]){
        RecursiveMethods venuj = new RecursiveMethods();
        
        System.out.println(venuj.factorial(5));
        System.out.println(venuj.sum(4));
        System.out.println(venuj.pow(3, 4));
        venuj.FIB(5);
        System.out.println(venuj.palstr("iazzai"));
        System.out.println(venuj.palstr("ioi"));
        System.out.println(venuj.palstr("ioizoi"));
        System.out.println(venuj.palint(101));
        System.out.println(venuj.palint(12));

    }
}
