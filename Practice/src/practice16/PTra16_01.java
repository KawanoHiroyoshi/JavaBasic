package practice16;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



/*
 */
public class PTra16_01 {
    public static void main(String[] args) {

        /*
        * ★ 現在時刻を「YYYY年MM月DD日」形式で出力してください
        */
    	LocalDateTime d = LocalDateTime.now();
    	DateTimeFormatter df2 =
    			DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
    		String s2 = df2.format(d);
    		System.out.println(s2);
    }
}