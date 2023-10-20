

import java.util.Scanner;
import java.util.Stack;
public class task3
{
    public static void zad_3_var_3()
    {
        String s;
        Scanner scan=new Scanner(System.in);
        s = scan.nextLine();
        Stack<Character> stack = new Stack();
        for(int i=s.length()-1;i>=0;i--)
        {
            stack.push(s.charAt(i));
        }
        System.out.println(stack);
    }



}
