package interpreter.ejercicios.ej1;

public class TerminalExpressionINT extends AbstractExpression {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("1") || context.input.startsWith("2") || context.input.startsWith("3") || context.input.startsWith("4") || context.input.startsWith("5") || context.input.startsWith("6") || context.input.startsWith("7") || context.input.startsWith("8") || context.input.startsWith("9") || context.input.startsWith("0")) {
            context.output = context.output + context.input.charAt(0);
            context.input = context.input.substring(1);
        }
    }
}
