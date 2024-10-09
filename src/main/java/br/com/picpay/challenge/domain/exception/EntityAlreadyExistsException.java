package br.com.picpay.challenge.domain.exception;

import lombok.Getter;

@Getter
public class EntityAlreadyExistsException extends Exception {
    private String details;

    public EntityAlreadyExistsException(String message){
        super(message);
    }

    public EntityAlreadyExistsException(String message, String details){
        super(message);
        this.details = details;
    }
}
