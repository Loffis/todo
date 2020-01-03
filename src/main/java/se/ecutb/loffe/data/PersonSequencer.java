package se.ecutb.loffe.data;

public class PersonSequencer {
    private static int personId;

    public PersonSequencer(int personId) {
        PersonSequencer.personId = personId;
    }

    static int nextPersonId(){
        personId++;
        return personId;
    }

    static int reset(){
        personId = 0;
        return personId;
    }

    public static int getPersonId() {
        return personId;
    }

    public static void setPersonId(int personId) {
        PersonSequencer.personId = personId;
    }
}
