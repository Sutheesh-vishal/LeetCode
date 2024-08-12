package Stacks;


import java.util.Stack;

public class ValidParanthesis {

    public boolean  isValid(String s) {

        //empty stack init
        Stack<Character> stack = new Stack<>();

        //itterating through the paranthesis
        for(int i =0;i<s.length();i++){

            //checking if stack is empty / the value is closing paranthesis
            if(!stack.isEmpty() && s.charAt(i)=='}' && stack.peek()=='{'){

                //popping the opening bracket
                stack.pop();
            }
            else if(!stack.isEmpty() && s.charAt(i)==')' && stack.peek()=='('){

                stack.pop();
            }
            else if (!stack.isEmpty() && s.charAt(i)==']' && stack.peek()=='[') {
                stack.pop();
            }
            //if not then pushing it to the stack to check with the upcoming values
            else{

                stack.push(s.charAt(i));
            }
        }

        //return true if the string is empty i.e there is no brackets left
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        ValidParanthesis Coffee = new ValidParanthesis();
        System.out.println(Coffee.isValid("(()}{}})"));

    }
}
