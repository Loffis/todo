package se.ecutb.loffe;

import se.ecutb.loffe.data.People;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        People p = new People();
        p.createPerson("lof", "pof");
        System.out.println(p.findById(1).getFirstName());
    }
}
