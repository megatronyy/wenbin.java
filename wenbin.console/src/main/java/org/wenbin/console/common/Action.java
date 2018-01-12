package org.wenbin.console.common;

import java.util.Objects;

/**
 * 接口函数
 * */
@FunctionalInterface
public interface Action {
    void accept();
    default Action andThen(Action after){
        Objects.requireNonNull(after);
        return ()->{accept();after.accept();};
    }
}
