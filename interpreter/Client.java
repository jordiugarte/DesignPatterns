package interpreter.ejercicios.ej1;

public class Client {

    public static void main (String [] args){
        String toInterpretate="1 - 3 + 3 - 1 + 5";
        System.out.println("Evaluate : "+toInterpretate+"\nInterpretate : "
                + new Parser(toInterpretate).evaluate());
    }
}
