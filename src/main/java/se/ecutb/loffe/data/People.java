package se.ecutb.loffe.data;

import se.ecutb.loffe.model.Person;

import java.util.Arrays;


public class People {
    private static Person[] personArray = new Person[0];

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
        personArray = expandArray(personArray, newPerson);
        return newPerson;
    }

    public void clear(){
        personArray = new Person[0];
    }

    private Person[] expandArray(Person[] sourceArray, Person newPerson){
        Person[] newArray = Arrays.copyOf(sourceArray, sourceArray.length + 1);
        newArray[newArray.length - 1] = newPerson;
        return newArray;
    }
}
