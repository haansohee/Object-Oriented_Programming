package stack;

import java.io.*;
import java.util.*;
import java.lang.Integer;

public class Main {

    static Stack myStack = new Stack();

    public static void main(String[] args) throws IOException{
        String infix = "";
        String postfix = "";
        int inData = 0;
        System.out.println("계산할 수식을 입력하십시오. >");

        while((inData = System.in.read()) != 0x0A)
        {
            infix = infix + (char)inData;
        }

        postfix = Trans(infix);
        Calculation(postfix);

    }

    public static String Trans(String infix)
    {
        System.out.println();
        String postfix="";
        char split[] = new char[infix.length()];
        int opr1 = 0;
        int opr2 = 0;
        int count = 0;
        char cha = ' ';
        char a = ' ';

        for(int i=0; i<infix.length(); i++)
        {
            split[i] = infix.charAt(i);
            
            if(split[i]=='(')
            {
                count = count + 1;
            }
            else if(split[i] == ')')
            {
                count = count - 1;

                if(count == 0)
                {
                    while(a != '(')
                    {
                        char m = ' ';
                        m = split[i];
                        if((a != '(') || (m !=')'))
                        {
                        cha = ((Character)myStack.pop());
                        postfix = postfix + cha;
                        a = (Character)myStack.peek();
                        }
                        else if((a == '(') || (m ==')'))
                        {
                            myStack.pop();
                        }
                    }
                }
            }
            if((split[i]=='+') || (split[i]=='-') || (split[i]=='*') || (split[i]=='/') || (split[i]=='%')
                     || (split[i]=='(') || (split[i]==')'))
            {
                opr2 = Level(split[i]);
                if(opr1 < opr2)
                {
                    myStack.push(split[i]);
                    opr1 = opr2;
                }
                else
                {
                    char top = ' ';
                    top = split[i];
                    if((a != '(' || top != ')'))
                    {
                    a = (Character)myStack.pop();
                    postfix = postfix + a;
                    }
                    myStack.push(split[i]);
                }
            }
            else if((split[i]!='+') || (split[i]!='-') || (split[i]!='*') || (split[i]!='/') || (split[i]!='%')
                    || (split[i]!='(') || (split[i]!=')'))
            {
                a = split[i];
                postfix = postfix + a;
            }
            System.out.println("토큰 : " + split[i] + " 스택상태 : " + myStack + " 변환상태 : " + postfix);
        }
        while(myStack.empty() != true)
        {
            char top = ' ';
            top = (Character)myStack.peek();
            if(top == '(' || top ==')')
            {
            myStack.pop();
            }
            else
            {
            a = (Character)myStack.pop();
            postfix = postfix + a;
            System.out.println("스택상태 : " + myStack + " 변환상태 : " + postfix);
            }
        }
        return postfix;
    }
    public static int Level(char chData)
    {
        int opr = 0;
        switch(chData)
        {
            case '+': case '-': opr = 2; break;
            case '*': case '/': case '%': opr = 3; break;
            case '(': case ')': opr = 1; break;
        }
        return opr;
    }
    public static void Calculation(String postfix)
    {
        System.out.println();
        int[] su = new int[postfix.length()];
        int opr1 = ' ';
        int opr2 = ' ';
        int sum = 0;
        char a = ' ';
        System.out.println("계산할 Postfix : " + postfix);
        for(int i=0; i<postfix.length(); i++)
        {
            if(postfix.charAt(i) == '+' || postfix.charAt(i) == '-' || postfix.charAt(i) == '*'
                || postfix.charAt(i) == '/' || postfix.charAt(i) == '%')
            {
                switch(postfix.charAt(i))
                {
                    case '+':
                        opr2 = ((Integer)myStack.pop()).intValue();
                        opr1 = ((Integer)myStack.pop()).intValue();
                        sum = opr1 + opr2;
                        myStack.push(sum);
                        break;
                    case '-':
                        opr2 = ((Integer)myStack.pop()).intValue();
                        opr1 = ((Integer)myStack.pop()).intValue();
                        sum = opr1 - opr2;
                        myStack.push(sum);
                        break;
                    case '*':
                        opr2 = ((Integer)myStack.pop()).intValue();
                        opr1 = ((Integer)myStack.pop()).intValue();
                        sum = opr1 * opr2;
                        myStack.push(sum);
                        break;
                    case '/':
                        opr2 = ((Integer)myStack.pop()).intValue();
                        opr1 = ((Integer)myStack.pop()).intValue();
                        sum = opr1 / opr2;
                        myStack.push(sum);
                        break;
                    case '%':
                        opr2 = ((Integer)myStack.pop()).intValue();
                        opr1 = ((Integer)myStack.pop()).intValue();
                        sum = opr1 % opr2;
                        myStack.push(sum);
                        break;
                }
            }
            else
            {
                su[i] = postfix.charAt(i);
                su[i] = su[i] - 48;
                myStack.push(su[i]);
            }
            System.out.println("스택상태 : " + myStack);
        }
        System.out.println();
        System.out.println("결과 : " + myStack);
    }
}
