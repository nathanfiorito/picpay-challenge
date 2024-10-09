package br.com.picpay.challenge.domain.exception;

import br.com.picpay.challenge.domain.response.DataResponse;
import br.com.picpay.challenge.domain.response.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(EntityAlreadyExistsException.class)
    public ResponseEntity<?> handleException(EntityAlreadyExistsException ex){
        var errors = List.of(Error.builder()
                        .error(ex.getMessage())
                        .details(ex.getDetails())
                .build());

        return ResponseEntity.badRequest().body(errors);
    }
}
