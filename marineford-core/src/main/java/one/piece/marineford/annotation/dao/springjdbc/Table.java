package one.piece.marineford.annotation.dao.springjdbc;

import java.lang.annotation.*;

/**
 *
 *
 * 指定表名，在类或接口上使用
 *
 * Created by Administrator on 2016/4/21.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Table {

    public abstract String name();

}
