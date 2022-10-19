package month;

public class Month {
    private String nameOfMonth;
    private int amountOfDays;
    private int amountOfWorkDays;

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

    public void setAmountOfWorkDays(int amountOfWorkDays) {
        this.amountOfWorkDays = amountOfWorkDays;
    }
}
