package EPAM;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class balancedParanthesis {

    static boolean bracket(String str){
        Deque<Character> stack=new ArrayDeque<Character>();
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                stack.push(x);
                continue;
            }

            if(stack.isEmpty()){
                return false;
            }
            char check;
            switch (x){
                case ')':
                    check=stack.pop();
                    if(check=='[' || check=='{'){
                        return false;
                    }
                    break;
                case ']':
                    check=stack.pop();
                    if(check=='('||check=='{'){
                        return false;
                    }
                    break;
                case '}':
                    check=stack.pop();
                    if(check=='(' || check=='['){
                        return false;
                    }
                    break;

            }
        }
        return stack.isEmpty();

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();//"(a+b[d]Dd+{I})";
        if(bracket(str)){
            System.out.println("Balanced");

        }
        else{System.out.println("Not Balanced");}

    }
}
