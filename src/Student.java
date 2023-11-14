public class Student {
    private int id;
    private BirthDate birthDate;

    public Student(int id, int date, int month, int year) {
        this.id = id;
        this.birthDate = new BirthDate(date, month, year);
    }

    public int getId() {
        return id;
    }
    public BirthDate getBirthDate() {
        return birthDate;
    }
}
