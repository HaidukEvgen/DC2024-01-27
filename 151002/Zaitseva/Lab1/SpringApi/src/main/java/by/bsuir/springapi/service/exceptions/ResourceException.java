package by.bsuir.springapi.service.exceptions;

import by.bsuir.springapi.model.response.ErrorResponseTo;
import jakarta.annotation.Nullable;
import lombok.Getter;

@Getter
public class ResourceException extends RuntimeException {
    @Nullable
    private final ErrorResponseTo error;

    public ResourceException(String message, int code) {
        super(message);
        error = new ErrorResponseTo(code, message, null);
    }
}
