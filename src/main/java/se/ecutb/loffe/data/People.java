package se.ecutb.loffe.data;

import se.ecutb.loffe.model.Person;


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

    private Person createPerson(String firstName, String lastName){
        Person newPerson = new Person(PersonSequencer.nextPersonId(), firstName, lastName);
        expandArray(personArray);
        personArray[personArray.length - 1] = newPerson;
        return newPerson;
    }

    public void clear(){
        personArray = new Person[0];
    }

    private Person[] expandArray(Person[] personArray){
        int size = personArray.length;
        Person[] tempArray = new Person[size + 1];
        tempArray = personArray.clone();
        personArray = new Person[size + 1];
        personArray = tempArray.clone();
        return personArray;
    }

}
