package month;

public  class MonthUtils {


    private static Month[] MONTH_ARRAY = {
            new Month ("January", 31, 22),
            new Month ("February", 28, 20),
            new Month ("March", 31, 23),
            new Month ("April", 30, 20),
            new Month ("Mai", 28, 20),
            new Month ("June", 30, 22),
            new Month ("July", 31, 21),
            new Month ("August", 31, 23),
            new Month ("September", 30, 21),
            new Month ("October", 31, 22),
            new Month ("November", 30, 22),
            new Month ("December", 31, 21),
    };
    private static Month[] MONTH_1QARRAY = {
            new Month ("January", 31, 22),
            new Month ("February", 28, 20),
            new Month ("March", 31, 23),

    };
    private static Month[] MONTH_2QARRAY = {
            new Month ("April", 30, 20),
            new Month ("Mai", 28, 20),
            new Month ("June", 30, 22),

    };
    private static Month[] MONTH_3QARRAY = {
            new Month ("July", 31, 21),
            new Month ("August", 31, 23),
            new Month ("September", 30, 21),

    };
    private static Month[] MONTH_4QARRAY = {
            new Month ("October", 31, 22),
            new Month ("November", 30, 22),
            new Month ("December", 31, 21),
    };

    public static Month[] getMonthArray() {
        return MONTH_ARRAY;
    }

    public static Month[] getMonth1qarray() {
        return MONTH_1QARRAY;
    }

    public static Month[] getMonth2qarray() {
        return MONTH_2QARRAY;
    }

    public static Month[] getMonth3qarray() {
        return MONTH_3QARRAY;
    }

    public static Month[] getMonth4qarray() {
        return MONTH_4QARRAY;
    }
}
