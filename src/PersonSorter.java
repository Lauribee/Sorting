import java.util.Arrays;

public class PersonSorter {

    public void start() {
        Person[] arr = new Person[3];
        arr[1] = new Person("Ron", "Weasley");
        arr[0] = new Person("Harry", "Potter");
        arr[2] = new Person("Hermione", "Granger");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        QuickSort.sort(arr);
        System.out.println("Efter sortering: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        PersonSorter app = new PersonSorter();
        app.start();
    }
}
