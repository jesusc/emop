package mop.emf.core.functional;

import java.util.Objects;

@FunctionalInterface
public interface EmptyFunction {

    void exec();

    default EmptyFunction andThen(EmptyFunction after) {
        Objects.requireNonNull(after);
        return () -> { exec(); after.exec(); };
    }
}