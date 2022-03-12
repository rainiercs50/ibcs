import java.util.*;

public class somejava{
    public static void main(String args[]){
        int a[] = new int[4];
        a[0] = 1; a[1] = 2; a[2] = 2; a[3] = 3;
        int low = 0, high = 3, target = 4;
        
        boolean flag = true;
        while(low <= high && flag == true){
            int m = (low + high) / 2;
            if(a[m] == target){
                System.out.println("YES");
                flag = false;
            }else if(a[m] < target){
                low = m + 1;
            }else{
                high = m - 1;
            }
        }
        if(flag == true){
            System.out.println("NO");
        }
    }
}
