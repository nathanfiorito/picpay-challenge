package br.com.picpay.challenge.usecases.auth;

import br.com.picpay.challenge.domain.exception.EntityAlreadyExistsException;
import br.com.picpay.challenge.domain.mapper.UserMapper;
import br.com.picpay.challenge.domain.request.SignUpRequest;
import br.com.picpay.challenge.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import static java.util.Objects.nonNull;

@RequiredArgsConstructor
public class SignUpUseCaseImpl implements SignUpUseCase {
    private UserRepository userRepository;

    @Override
    public void execute(SignUpRequest request) throws EntityAlreadyExistsException {
        if(checkIfUserAlreadyExists(request))
            throw new EntityAlreadyExistsException("Occurred and error while trying to create a new user.", "Email or CPF already registered.");

        userRepository.save(UserMapper.from(request));
    }

    private boolean checkIfUserAlreadyExists(SignUpRequest request) {
        var userEntity = userRepository.findByEmailAndCpf(request.getEmail(), request.getCpf());

        return !nonNull(userEntity);
    }
}
