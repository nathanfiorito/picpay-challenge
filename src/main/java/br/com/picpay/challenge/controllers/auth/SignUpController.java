package br.com.picpay.challenge.controllers.auth;

import br.com.picpay.challenge.domain.exception.EntityAlreadyExistsException;
import br.com.picpay.challenge.domain.request.SignUpRequest;
import br.com.picpay.challenge.usecases.auth.SignUpUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
public class SignUpController implements SignUpApi {
    private SignUpUseCase signUpUseCase;

    @Override
    public ResponseEntity<?> execute(SignUpRequest request) throws EntityAlreadyExistsException {
        signUpUseCase.execute(request);
        return new ResponseEntity<>(CREATED);
    }
}
