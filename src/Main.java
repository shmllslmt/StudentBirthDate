public class Main {
    public static void main(String[] args) {
        Student nicholas = new Student(230037, 1, 1, 2000);

        System.out.println(nicholas.getId());
        System.out.println(nicholas.getBirthDate());

        BirthDate newDate = nicholas.getBirthDate();

        newDate.setDate(17);
        newDate.setMonth(12);

        System.out.println(nicholas.getId());
        System.out.println(nicholas.getBirthDate());

    }
}