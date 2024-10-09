package br.com.picpay.challenge.controllers.auth;

import br.com.picpay.challenge.domain.exception.EntityAlreadyExistsException;
import br.com.picpay.challenge.domain.request.SignUpRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping("auth")
public interface SignUpApi {
    @CrossOrigin
    @GetMapping(path = "signup", produces = APPLICATION_JSON_VALUE)
    ResponseEntity<?> execute(@Valid @RequestBody SignUpRequest request) throws EntityAlreadyExistsException;
}
