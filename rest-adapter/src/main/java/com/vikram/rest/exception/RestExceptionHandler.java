package com.vikram.rest.exception;

import com.vikram.rest.model.ErrorResponseDto;
import com.vikram.service.exception.EntityNotFoundException;
import org.slf4j.MDC;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = {EntityNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponseDto resourceNotFoundException(EntityNotFoundException entityNotFoundException,
                                                      WebRequest webRequest) {

        return new ErrorResponseDto(MDC.get("CorrelationId"), entityNotFoundException.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponseDto internalServiceError(Exception ex, WebRequest webRequest) {
        return new ErrorResponseDto(MDC.get("CorrelationId"), ex.getMessage());
    }
}
