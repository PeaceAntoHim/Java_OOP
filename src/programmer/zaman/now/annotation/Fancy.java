package programmer.zaman.now.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Learn how to made annotation
// Annotation default in java
// @Override, for mark is thois are method was overrided from method parent class
// @Deprecated, this for mark if a method not recomend again for reusable
// @Functionalinterface, this to mark if a class was made us lambda expression

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {

    String name();

    String[] tags() default {};

}
