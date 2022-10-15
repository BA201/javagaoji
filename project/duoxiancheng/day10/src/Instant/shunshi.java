package Instant;

import org.junit.Test;

import javax.swing.text.Style;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class shunshi {

    @Test
    public void Instanttest()
    {

//获取本初子午线对应的时间。
        Instant instant = Instant.now();
        System.out.println(instant);
        //atOffset()调整偏移量。
        OffsetDateTime y= instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(y);
        //toEpochMilli();与getTime()类似，获取自1970年来的毫秒数。
        System.out.println(instant.toEpochMilli());
        //ofEpochMilli();通过给定的毫秒数，转化为Instant实例。静态方法。
        System.out.println(Instant.ofEpochSecond(1410914014l));


    }



    @Test
    public void DateTimeFormatterTest()
    {
//预定义方式实例化。
        DateTimeFormatter ma= DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime dd=LocalDateTime.now();
       String i= ma.format(dd);
        System.out.println(i);
        TemporalAccessor y = ma.parse(i);
        System.out.println(y);
        //本地化方式实例化。
        DateTimeFormatter ddd = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String o = ddd.format(dd);
        System.out.println(o);
        //自定义方式实例化。
        DateTimeFormatter t = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String g=t.format(dd);
        System.out.println(g+"自定义的方式");
        TemporalAccessor tt = t.parse(g);
        System.out.println(tt+"解析");
    }

}
