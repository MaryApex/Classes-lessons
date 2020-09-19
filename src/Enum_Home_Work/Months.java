package Enum_Home_Work;

public enum Months {
    JANUARY (31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private int days;
    private String season;

    Months(int days;String season){
        this.days = days;
        this.season = season;

    }

}
