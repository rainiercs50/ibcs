import java.util.*;

public class somejava{
    public static void main(String args[]){
        int a[] = new int[5];
        a[0] = 0; a[1] = 1; a[2] = 0; a[3] = 4; a[4] = 1;
        for(int i = 0; i < 5; ++i){
            int k = i;
            for(int j = i + 1; j < 5; ++j){
                if(a[j] < a[k]){
                    k = j;
                }
            }
            int v = a[i];
            a[i] = a[k];
            a[k] = v;
        }
    }
}
