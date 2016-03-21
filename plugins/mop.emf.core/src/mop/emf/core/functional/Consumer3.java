package mop.emf.core.functional;

import java.util.Objects;

@FunctionalInterface
public interface Consumer3<T, T2, T3> {

    /**
     * Performs this operation on the given argument.
     *
     * @param t the input argument
     */
    void accept(T t, T2 t2, T3 t3);

    default Consumer3<T, T2, T3> andThen(Consumer3<? super T, ? super T2, ? super T3> after) {
        Objects.requireNonNull(after);
        return (T t, T2 t2, T3 t3) -> { accept(t, t2, t3); after.accept(t, t2, t3); };
    }
}