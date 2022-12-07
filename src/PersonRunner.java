public class PersonRunner {
    public static void main(String[] args) {
        // note that THREE Person objects are created

        Person person1 = new Person("Adam", "Jones");
        Person person2 = new Person("John", "Smith");

        person1.meetPerson(person2);

        System.out.println(person1.getNumMeetings());
        System.out.println(person2.getNumMeetings());



        person2.meetPerson(person1);

        System.out.println(person1.getNumMeetings());
        System.out.println(person2.getNumMeetings());



        Person person3 = new Person("Amy", "Jordan");
        person3.meetPerson(person2);

        System.out.println(person1.getNumMeetings());
        System.out.println(person2.getNumMeetings());
        System.out.println(person3.getNumMeetings());

    }
}
