package com.template.api.app.config.domain;

import com.template.api.jpa.domain.BaseRepository;

import java.util.Optional;

public interface ConfigRepository extends BaseRepository<Config, Long> {

    Optional<Config> findTopByOrderByIdDesc();

}
