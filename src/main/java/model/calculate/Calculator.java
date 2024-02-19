package model.calculate;

public interface Calculator<E> {
    E add(E a, E b);

    E subtract(E a, E b);

    E multiply(E a, E b);

    E divide(E a, E b);
}
