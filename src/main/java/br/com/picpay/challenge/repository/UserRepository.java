package br.com.picpay.challenge.repository;

import br.com.picpay.challenge.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserEntity findByEmailAndCpf(String email, String cpf);
}
