package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class StackParanthesis {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        char c[]=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(Character ch:c){
            if(ch=='(' || ch=='{' || ch=='[') {
                stack.push(ch);
            }
            else if(ch==')'){
                if(stack.isEmpty() || stack.peek()!='('){
                    return false;
                }
                stack.pop();
            }
            else if(ch=='}'){
                if(stack.isEmpty() || stack.peek()!='{'){
                    return false;
                }
                stack.pop();
            }
            else if(ch==']'){
                if(stack.isEmpty() || stack.peek()!='['){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
