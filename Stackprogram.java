import java.util.*;

class SC{
    int stack[] = new int[5];
    int top;
    SC(){
        top = -1;
    }
    public boolean IsEmpty(){
        return top == -1;
    }
    public boolean IsFull(){
        return top == 4;
    }

    public void push(int x){
        stack[++top] = x;
    }
    public int pop(){
        int v = stack[top];
        stack[top--] = 0;
        return v;
    }
    public void print(){
        for(int i = top; i >= 0; ++i)
            System.out.print(stack[i] + " ");
        System.out.println();
    }
}
public class stackclass{
    public static void main(String args[]){
        SC s = new SC();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag){
            int q = sc.nextInt();
            if(q == 1){
                if(s.IsFull() == true){
                    System.out.println("Stack overflow");
                }else{
                    int x = sc.nextInt();
                    s.push(x);
                }
            }else if(q == 2){
                if(s.IsEmpty() == true){
                    System.out.println("Stack underflow");
                }else{
                    System.out.println(s.pop());
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
