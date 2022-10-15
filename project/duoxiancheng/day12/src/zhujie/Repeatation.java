package zhujie;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

public class Repeatation {

    @Inherited
    @Repeatable(dd.class)
    @Retention(RetentionPolicy.RUNTIME)
    @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, TYPE_PARAMETER})
    public @interface cc {

      String[] value();

    }

    @Inherited
    @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface dd
    {
      cc[] value();
    }


    @cc("xiao")

    @cc("cc")
            @cc("dd")
    String a="dd";

class vv<@cc("WOCAO") t>
{

}

}
