package interpreter.ejercicios.ej1;

import java.util.ArrayList;

public class Parser {
    // no terminal expresion
    private ArrayList<AbstractExpression> parseTree = new ArrayList<AbstractExpression>();
    private Context context;

    public Parser(String s) {
        context = new Context(s.replace(" ", ""));
        for (String token : s.split(" ")) {
            switch (token) {
                case "+":
                    parseTree.add(new TerminalExpressionPlus());
                    break;
                case "-":
                    parseTree.add(new TerminalExpressionMinus());
                    break;
                default:
                    parseTree.add(new TerminalExpressionINT());
                    break;
            }
        }
    }

    public int evaluate() {
        for (AbstractExpression e : parseTree)
            e.interpreter(context);

        int val = Integer.parseInt(String.valueOf(context.output.charAt(0)));
        for (int i = 0; i < context.output.length(); i++) {
            if (context.output.charAt(i) == '+') {
                val += Integer.parseInt(String.valueOf(context.output.charAt(i + 1)));
            } else if (context.output.charAt(i) == '-') {
                val -= Integer.parseInt(String.valueOf(context.output.charAt(i + 1)));
            }
        }

        return val;
    }
}
