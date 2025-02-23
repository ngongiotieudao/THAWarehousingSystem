package com.giomuathu.AquariumWarehousingSupportSystem.repository;

import com.giomuathu.AquariumWarehousingSupportSystem.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AccountEntity, Long> {

    Optional<AccountEntity> getByUsernameAndPassword(String username, String password);

    Optional<AccountEntity> getByUsername(String username);

    Optional<AccountEntity> getFirstByEmail(String email);
}
