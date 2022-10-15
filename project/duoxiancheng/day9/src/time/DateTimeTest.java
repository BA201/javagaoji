package time;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * SimpleDateFormat的使用：SimpleDateFormat()对Date类的解析和格式化。
 * 两个操作：
 *
 * 格式化： 日期--->字符串。
 * 解析：   字符串---->日期。
 */
public class DateTimeTest {

//实例化SimpleDateFormat类。

  @Test
    public void testsimpleformat()
  {

    //使用无参构造。
    SimpleDateFormat si=new SimpleDateFormat();
    Date da=new Date();
    System.out.println(da);
    //格式化
    String t=si.format(da);
    System.out.println(t);

    //解析，格式化的逆过程，是有要求的，格式必须跟格式化的格式一样才行，使用过程中一般都用有参构造的。
    Date ii= null;
    try {
      ii = si.parse("22-12-03 上午11:30");//如果格式不一样，那么就会报错 Unparseable date: "22-12-03 11:30"
    } catch (ParseException e) {
      e.printStackTrace();
    }
    System.out.println(ii);

    System.out.println("*********************************************************************");

    //使用有参构造可以自己定义日期的格式。
    SimpleDateFormat y=new SimpleDateFormat("yyyy年-MM月-dd日-hh:mm:ss");//可以自己定义日期格式，要是想要解析，那么格式必须一样。
    String tt=y.format(da);
    System.out.println(tt);
    try {
      Date uu=y.parse("2222年-10月-03日-11:53:05");
      System.out.println(uu);
    } catch (ParseException e) {
      e.printStackTrace();
    }

  }





  @Test
  public void testCalendar()
  {
    //实例化：方式一:创建其子类（GregorianCalendar）的对象
    //方式二:调用其静态方法，Calendar.getInstance();这个比较常用。

//常用方法：
    Calendar ca=Calendar.getInstance();
    //get()获取当前日期。
    int i=ca.get(Calendar.DATE);
    System.out.println(i);
    //set()将当前日期修改为
    ca.set(Calendar.DAY_OF_WEEK_IN_MONTH,7);
    int ii= ca.get(Calendar.DAY_OF_WEEK_IN_MONTH);
    System.out.println(ii);
    //add()在当前日期基础上添加或减去日期
    ca.add(Calendar.DAY_OF_WEEK_IN_MONTH,2);
    System.out.println(ca.get(Calendar.DAY_OF_WEEK_IN_MONTH));
    //getTime(): 将日历类改为Date类
    Date uuu=ca.getTime();
    System.out.println(uuu);
    //setTime();；与getTime()相反，将Date类改为日历类。
     ca.setTime(uuu);
    System.out.println(ca.get(Calendar.DAY_OF_WEEK_IN_MONTH));
  }



}
