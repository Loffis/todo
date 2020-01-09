package se.ecutb.loffe.data;

import se.ecutb.loffe.model.Person;

import java.util.Arrays;

public class People {

    private static Person[] personArray;

    static {
        personArray = new Person[0];
    }

    public int size(){
        return personArray.length;
    }

    public Person[] findAll(){
        return personArray;
    }

    public Person findById(int personId){
        for (Person person : personArray) {
            if (person.getPersonId() == personId)
                return person;
        }
        return null;
    }

    public Person createPerson(String firstName, String lastName){
        Person newPerson = new Person(PersonSequencer.nextPersonId(), firstName, lastName);
        personArray = Arrays.copyOf(personArray, personArray.length + 1);
        personArray[personArray.length - 1] = newPerson;
        return newPerson;
    }

    public void clear(){
        personArray = new Person[0];
    }

}
