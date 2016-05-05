package one.piece.marineford.annotation.dao.springjdbc;

import java.lang.annotation.*;

/**
 *
 *
 * 指定主键，在GET方法上使用
 *
 * Created by Administrator on 2016/4/21.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Id {

}
