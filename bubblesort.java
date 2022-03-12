import java.util.*;

public class somejava{
    public static void main(String args[]){
        int a[] = new int[5];
        a[0] = 0; a[1] = 1; a[2] = 0; a[3] = 4; a[4] = 1;
        boolean sorted = false;
        while(sorted == false){
            sorted = true;
            for(int i = 0; i < 4; ++i){
                if(a[i] > a[i+1]){
                    int v = a[i+1], v1 = a[i];
                    a[i] = v;
                    a[i+1] = v1;
                    sorted = false;
                }
            }
        }
    }
}
