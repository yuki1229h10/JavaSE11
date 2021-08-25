package chapter7P.eight;

public class Main {
    public static void main(String[] args) {
        String[] week_days = { "月", "火", "水", "木", "金", "土", "日" };
        for (int i = 1; i <= 7; i++) {
            System.out.println("The day of the week : " + week_days[i]);
        }
    }
}

// i = 0ではない為、例外が発生する。