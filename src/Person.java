public class Person {
    private String firstName;
    private String lastName;
    private int numMeetings;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void meetPerson(Person otherPerson) {
        System.out.println("Hello, my name is " + firstName + "\n" + "Hi, my name is " + otherPerson.getFirstName());
        numMeetings++;
        otherPerson.setNumMeetings(otherPerson.getNumMeetings() + 1);
    }

    public String getFirstName() {
        return firstName;
    }

    public int getNumMeetings() {
        return numMeetings;
    }

    public void setNumMeetings(int numMeetings) {
        this.numMeetings = numMeetings;
    }
}
