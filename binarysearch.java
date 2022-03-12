import java.util.*;


public class BS{
    
    public static void main(String args[]){
        int v[] = new int[5];
        v[0] = 1; v[1] = 2; v[2] = 2; v[3] = 2; v[4] = 3; 
        int low = 0, high = 4;
        while(low < high){
            int mid = (low + high) / 2;
            if(v[mid] >= 2){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        System.out.println(low);
        int LOW = 0, HIGH = 4;
        while(LOW < HIGH){
            int MID = (LOW + HIGH + 1) / 2;
            if(v[MID] <= 2){
                LOW = MID;
            }else{
                HIGH = MID - 1;
            }
        }
        
        System.out.println(LOW);
        
    }
}
