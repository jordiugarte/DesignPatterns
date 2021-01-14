package interpreter.ejercicios.ej1;

public class TerminalExpressionMinus extends AbstractExpression {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("-")) {
            context.output = context.output + "-"; // la interpretacion --> contruyendo resultado interpretado
            context.input = context.input.substring(1); // Elimina caracter interpretado
        }
    }
}
