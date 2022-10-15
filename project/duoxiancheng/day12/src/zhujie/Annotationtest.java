package zhujie;

import org.junit.Test;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * @since a 获取对象
 */

public class Annotationtest {
    @zhujie()
    String a = "ee";

    @SuppressWarnings("unused")
    public Annotationtest() {

    }


    @Retention(RetentionPolicy.RUNTIME)
    public @interface zhujie {
        String[] value() default "xiaoming";
    }


    @Test
    public void zhutest() {
        @a({@b(value = "ciao"), @b(value = "dd")})
        String a = "di";
    }

    public @interface a {
        b[] value();
    }

    public @interface b {
        String value();
    }



}
