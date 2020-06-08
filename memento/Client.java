package ejercicios3.memento;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker backups = new CareTaker(originator);

        DataBase dataBase;

        dataBase = new DataBase(new ArrayList<>());

        dataBase.setPersona(new Persona("Jose", 1234567, 25));
        originator.setState(dataBase);
        backups.addMemento(originator.createMemento());

        dataBase.setPersona(new Persona("Rodrigo", 1234563, 31));
        originator.setState(dataBase);
        backups.addMemento(originator.createMemento());

        dataBase.setPersona(new Persona("Federico", 1234563, 49));
        originator.setState(dataBase);
        backups.addMemento(originator.createMemento());

        dataBase.setPersona(new Persona("Alonso", 1234564, 51));
        originator.setState(dataBase);
        backups.addMemento(originator.createMemento());

        dataBase.setPersona(new Persona("Freddy", 1234563, 46));
        originator.setState(dataBase);
        backups.addMemento(originator.createMemento());

        originator.restoreFromMemento(backups.getMemento(1));

    }
}
