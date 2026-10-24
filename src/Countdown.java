import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Countdown {

    // ↓↓↓ 只改这一行，换成你的名字
    static final String NAME = "杰";

    // 2029 届秋招提前批大概从这时候开始
    static final LocalDate TARGET = LocalDate.of(2028, 8, 15);

    public static void main(String[] args) {
        long days = ChronoUnit.DAYS.between(LocalDate.now(), TARGET);

        System.out.println("你好，" + NAME);
        System.out.println("距离 2028 年秋招还有 " + days + " 天");
        System.out.println("折合 " + (days / 7) + " 周，约 " + (days / 30) + " 个月");
    }
}