package Lesson2.random;

public class App {

    public static void main(String[] args) throws IllegalAccessException {

        //Person person  = PersonUtils.getPerson();
        //sout (person.getAge));
        Person person = new Person();
        RandomIntProcessor.process(person);
        System.out.println(person.getAge());
    }

}
