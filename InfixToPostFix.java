import java.util.Stack;

class Main
{

    public static int Priority(char item)
    {
        if(item == '+' || item == '-' ) return 1;
        if(item == '*' || item == '/' ) return 2;
        return 0;
    }

    public static String InfixToPostFix(String exp)
    {
        String Output = "";
        Stack<Character> stack = new Stack<>();

        for(short i = 0; i < exp.length(); i++)
        {
            if(Character.isLetterOrDigit(exp.charAt(i)))
            {
                Output += exp.charAt(i);
            }
            else if(exp.charAt(i) == '(')
            {
                stack.push(exp.charAt(i));
            }
            else if(exp.charAt(i) == ')')
            {
                while(stack.peek() != '(')
                {
                    Output += stack.pop();
                }
                stack.pop();
            }
            else
            {
                while(!stack.isEmpty() && Priority(exp.charAt(i)) <= Priority(stack.peek()))
                {
                    Output += stack.pop();
                }
                stack.push(exp.charAt(i));
            }

        }

        while(!stack.isEmpty())
        {
            Output += stack.pop();
        }

        return Output;
    }