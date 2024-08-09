package ru.tardyon.account.exception;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
@NoArgsConstructor
public class InvalidJwtAuthenticationException extends Throwable {
    public InvalidJwtAuthenticationException(String expired_or_invalid_jwt_token) {
    }
}
