// BirthDate class is NOT IMMUTABLE
public class BirthDate {
    private int date;
    private int month;
    private int year;

    public BirthDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return date + "-" + month + "-" + year;
    }
}
