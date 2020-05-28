package ejercicio4;

public class FactoryMateria {

    public enum materiaType{MATEMATICAS, LENGUAJE, HISTORIA, INGLES}

    public static IMateria make(materiaType type) {
        IMateria materia;

        switch (type) {
            case MATEMATICAS:
                materia = new Matematicas();
                ((Matematicas) materia).setDuracion(6);
                ((Matematicas) materia).setMaterialAdicional("Calculadora");
                ((Matematicas) materia).setProfesor("Porfirio Roldan");
                ((Matematicas) materia).setTipo("Exactas");
                break;
            case LENGUAJE:
                materia = new Lenguaje();
                ((Lenguaje) materia).setDuracion(6);
                ((Lenguaje) materia).setProfesor("Isabel Aliaga");
                ((Lenguaje) materia).setTipo("Sociales");
                break;
            case HISTORIA:
                materia = new Historia();
                ((Historia) materia).setDuracion(3);
                ((Historia) materia).setNivel(2);
                ((Historia) materia).setProfesor("Javier Ortiz");
                ((Historia) materia).setTipo("Sociales");
                break;
            case INGLES:
                materia = new Ingles();
                ((Ingles) materia).setCosto(500);
                ((Ingles) materia).setDuracion(12);
                ((Ingles) materia).setProfesor("Fabiola Pasten");
                ((Ingles) materia).setTipo("Sociales");
                break;
            default:
                materia = new Lenguaje();
                break;
        }
        return materia;
    }
}
