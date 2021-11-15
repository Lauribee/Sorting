public class Person implements Sammenlignbar {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }

    public int compareTo(Sammenlignbar other) {
        /*String voresFornavn = firstName;
        String andetFornavn = andenPerson.firstName;

        if (voresFornavn.compareTo(andetFornavn) <= 0) {
            return -1;
        } else
        return 1;
    }*/
        //return firstName.compareTo(andenPerson.firstName);
        Person andenperson = (Person) other;
    }

}
