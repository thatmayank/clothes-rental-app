package com.mayank.leapsclothesrentalapplication.repository;

import com.mayank.leapsclothesrentalapplication.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {

    Optional<Token> findByAccessToken(String token);
}
