static class Evaluation
    {
        static Stack<Integer> numbers = new Stack<Integer>();

        public static void Processor(char item)
        {
            int SecondOperand = numbers.pop();
            int FirstOperand = numbers.pop();

            switch(item)
            {
            case '/' :
                numbers.push(FirstOperand / SecondOperand);
                break;

            case '*' :
                numbers.push(FirstOperand * SecondOperand);
                break;

            case '+' :
                numbers.push(FirstOperand + SecondOperand);
                break;

            case '-' :
                numbers.push(FirstOperand - SecondOperand);
                break;

            }

        }

        public static int Postfix(String exp)
        {
            numbers.clear();

            String [] tokens = exp.split(",");

            for(String token : tokens)
            {
                if(token.matches("\\d+"))
                {
                    numbers.push(Integer.parseInt(token));
                }
            }


            for(int i =0; i < exp.length(); i++)
            {
                if(Character.isDigit(exp.charAt(i)))
                {
                    numbers.push(exp.charAt(i) - '0');
                }
                else if(exp.charAt(i) == '/' || exp.charAt(i) == '*' || exp.charAt(i) == '+' || exp.charAt(i) == '-' )
                {
                    Processor(exp.charAt(i));
                }

            }

            return numbers.pop();

        }
    }