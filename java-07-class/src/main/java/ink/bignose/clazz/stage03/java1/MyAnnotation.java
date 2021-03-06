package ink.bignose.clazz.stage03.java1;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @author ailenk
 * @create 2016 上午 11:56
 */
@Inherited
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnotation {

    String value() default "hello";
}
