import java.time.ZonedDateTime;

/**
 * @author fty
 * @date 2020/11/23 22:20
 */
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();//默认时区
        System.out.println(zbj);
        //2020-11-23T22:24:22.242+08:00[Asia/Shanghai]
    }
}
