package ejercicio4;

public class Client {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Jordi Ugarte", FactoryMateria.make(FactoryMateria.materiaType.INGLES));
        Estudiante estudiante2 = new Estudiante("Mauricio Ayllon", FactoryMateria.make(FactoryMateria.materiaType.LENGUAJE));
        Estudiante estudiante3 = new Estudiante("Sergio Laguna",FactoryMateria.make(FactoryMateria.materiaType.MATEMATICAS));
        Estudiante estudiante4 = new Estudiante("Patrick Bruckner", FactoryMateria.make(FactoryMateria.materiaType.HISTORIA));
        Estudiante estudiante5 = new Estudiante("Manuel Mollinedo", FactoryMateria.make(FactoryMateria.materiaType.INGLES));
    }
}
