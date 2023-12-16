package com.template.api.app.user.domain;

import com.template.api.jpa.domain.BaseRepository;

import java.util.Optional;

public interface AccountRepository extends BaseRepository<Account, Long> {

    Optional<Account> findByUsername(String username);
}
