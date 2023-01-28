package practice;

import java.util.*;
class Stringdemo{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        char ch[]=check(s);
        for(int i=0;i<n;i++){
            if(ch[i]=='A'||ch[i]=='E'||ch[i]== 'I' || ch[i]=='O' || ch[i]=='U' || ch[i]=='a' || ch[i]=='e'|| ch[i]== 'i'|| ch[i]=='o' || ch[i]=='u'){
                System.out.println("Case #"+(i+1)+": "+s[i]+" is ruled by Alice.");

            }
            else if(ch[i]=='y'){
                System.out.println("Case #"+(i+1)+": "+s[i]+" is ruled by nobody.");
            }
            else{
                System.out.println("Case #"+(i+1)+": "+s[i]+" is ruled by Bob.");
            }

        }

    }
    public static char[] check(String s[]){
        int size= s.length;
        char ch[]=new char[size];
        for(int i=0;i<s.length;i++){
            int n=s[i].length();
            ch[i]=s[i].charAt(n-1);
        }
        return ch;
    }
}