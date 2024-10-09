package br.com.picpay.challenge.usecases.auth;

import br.com.picpay.challenge.domain.exception.EntityAlreadyExistsException;
import br.com.picpay.challenge.domain.request.SignUpRequest;
import org.springframework.stereotype.Component;

@Component
public interface SignUpUseCase {
    void execute(SignUpRequest request) throws EntityAlreadyExistsException;
}
