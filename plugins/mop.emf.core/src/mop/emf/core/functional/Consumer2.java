package mop.emf.core.functional;

import java.util.Objects;

@FunctionalInterface
public interface Consumer2<T, T2> {

    /**
     * Performs this operation on the given argument.
     *
     * @param t the input argument
     */
    void accept(T t, T2 t2);

    default Consumer2<T, T2> andThen(Consumer2<? super T, ? super T2> after) {
        Objects.requireNonNull(after);
        return (T t, T2 t2) -> { accept(t, t2); after.accept(t, t2); };
    }
}