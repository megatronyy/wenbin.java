package org.wenbin.console.common;

import java.util.Objects;

/**
 * 函数式接口
 * 1、只能有一个抽像方法
 * 2、可以有多个默认方法
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
