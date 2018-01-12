package org.wenbin.console.common;

@FunctionalInterface
public interface Func<T, TResult> {
    TResult invoke(T args);
}
