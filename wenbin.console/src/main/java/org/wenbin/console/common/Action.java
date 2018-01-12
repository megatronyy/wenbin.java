package org.wenbin.console.common;

import java.util.Objects;

/**
 * 接口函数
 */
@FunctionalInterface
public interface Action {
    void invoke();

    default Action andThen(Action after) {
        Objects.requireNonNull(after);
        return () -> {
            invoke();
            after.invoke();
        };
    }
}
