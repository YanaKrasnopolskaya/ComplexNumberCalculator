package model.logging;

import java.time.LocalDateTime;

public interface Logger<E> {
    void log(LocalDateTime time , String message, E res );
}
