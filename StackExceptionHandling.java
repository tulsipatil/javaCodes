import java.util.Scanner;

class StackOverFlowException extends Exception{
    public String toString(){
        return "Stack Over Flow - Stack full";
    }
}

class StackUnderFlowException extends Exception{
    public String toString(){
        return "Stack Under Flow - Stack empty";
    }
}

class Stack{

    private int size;
    private int top = -1;
    private int s[];

    public Stack(int sz){
        size = sz;
        s = new int[sz];
    }

    public void push(int x) throws StackOverFlowException{
        if (top==size-1)
            throw new StackOverFlowException();
        top++;
        s[top]=x;
    }

    public int pop() throws StackUnderFlowException{
        int x;
        if(top == -1)
            throw new StackUnderFlowException();
        x = s[top];
        top--;
        return x;
    }
}

public class StackExceptionHandling {
    public static void main(String[] args) throws Exception{
        Stack s = new Stack(5);

        try{
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
//            s.push(60);
        }
        catch (StackOverFlowException e){
            System.out.println(e);
        }

        try{
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
        }
        catch (StackUnderFlowException e){
            System.out.println(e);
        }

    }
}
