public class EnumExericse02 {
    public static void main(String[] args) {

        for (Week day : Week.values()) {
            System.out.println(day.name());
            System.out.println(day.ordinal());
        }

    }
}

enum Week {

    MONDAY("星期一"), TUESDAY("星期二"),
    WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期天");
    private String name;

    private Week(String name) {
        this.name = name;
    }

    Week() {
    }

    @Override
    public String toString() {
        return name;
    }
}
