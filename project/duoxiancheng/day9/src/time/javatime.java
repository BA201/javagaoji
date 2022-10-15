package time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class javatime {



    @Test
    public void testjavatime()
    {
        //now(),相当于空参构造。获取当前时间日期。
        LocalDate localDate= LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        //of();没有偏移量。相当于有参构造。获取指定时间，日期。
      LocalDateTime  localDate1=LocalDateTime.of(2003,2,23,12,4,34);
        System.out.println(localDate1);
        //getXxx()。获取日期时间可以是时、分、秒、年、月、日、当月的第几天等。
       int i= localDate.getDayOfYear();//今年的第几天。
        System.out.println(i);
        System.out.println(localDateTime.getMinute());//分
        System.out.println(localDateTime.getSecond());//秒
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        //withXxx()设置相关属性，体现了不可变性。是有返回值的原来的对象属性不会变。
      LocalDateTime yy=  localDateTime.withHour(23);
        System.out.println(yy);//设置后
        System.out.println(localDateTime);//设置前
        //plusXxx();在原有的基础上添加日期。也是有返回值的。
      LocalDateTime tt=  localDateTime.plusHours(2);
        System.out.println(tt);
        //minusXxx()与plus()相反，有返回值，减去日期。
       LocalDateTime hh= localDateTime.minusHours(10);
        System.out.println(hh);

    }


}
