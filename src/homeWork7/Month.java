package homeWork7;

public final class Month {
    private final String nameOfMonth;
    private final int amountOfDays;
    private final int amountOfWorkDays;

    public Month(String nameOfMonth, int amountOfDays, int amountOfWorkDays) {
        this.nameOfMonth = nameOfMonth;
        this.amountOfDays = amountOfDays;
        this.amountOfWorkDays = amountOfWorkDays;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }

    public int getAmountOfWorkDays() {
        return amountOfWorkDays;
    }

}
