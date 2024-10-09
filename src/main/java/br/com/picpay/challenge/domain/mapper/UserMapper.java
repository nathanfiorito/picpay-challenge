package br.com.picpay.challenge.domain.mapper;

import br.com.picpay.challenge.domain.entity.UserEntity;
import br.com.picpay.challenge.domain.request.SignUpRequest;

public class UserMapper {
    public static UserEntity from(SignUpRequest request){
        return UserEntity.builder()
                .cpf(request.getCpf())
                .email(request.getEmail())
                .name(request.getName())
                .password(request.getPassword())
                .build();
    }
}
