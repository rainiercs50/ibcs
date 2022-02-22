import java.util.*;

class SC{
    int queue[] = new int[5];
    int front, back;
    SC(){
        front = -1;
        back = -1;
        // front and back are NULL initially. 
    }
    public boolean IsEmpty(){
        return (front == -1 || (front > back));

    }
    public boolean IsFull(){
        return back == 4;
    }
    public void enque(int x){
        if(back == -1){
            front = 0;
            back = 0;
        }else
            back++;
      
        queue[back] = x;
    }
    public int deque(){
        int v = queue[front++];
        return v;
    }
    public void print(){
        if(IsEmpty() == false){
            for(int i = front; i <= back; ++i)
                System.out.print(queue[i] + " ");
            System.out.println(); 
        }
    }
}
public class somejava{
    public static void main(String args[]){
        SC s = new SC();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
     
        while(flag){
            int q = sc.nextInt();
            if(q == 1){
                if(s.IsFull() == true){
                    System.out.println("Queue overflow");
                }else{
                    int x = sc.nextInt();
                    s.enque(x);
                }
            }else if(q == 2){
                if(s.IsEmpty() == true){
                    System.out.println("Queue underflow");
                }else{
                    System.out.println(s.deque());
                }
            }else if(q == 3){
                s.print();
            }else if(q == 4){
                System.out.println(s.IsEmpty());
            }else if(q == 5){
                System.out.println(s.IsFull());
            }else{
                flag = false;
            }
        }
    }
}
