package com.template.api.app.config.service;

import com.template.api.app.config.domain.Config;
import com.template.api.app.config.domain.ConfigRepository;
import com.template.api.app.config.dto.ConfigDto;
import com.template.api.app.config.dto.ConfigDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ConfigService {

    private final ConfigRepository configRepository;

    @Transactional(readOnly = true)
    public ConfigDto.Response get() {
        Config config = this.configRepository.findTopByOrderByIdDesc().orElseGet(Config::new);
        return ConfigDtoMapper.INSTANCE.toResponse(config);
    }

    @Transactional
    public ConfigDto.Response update(ConfigDto.Update request) {
        Config config = ConfigDtoMapper.INSTANCE.toEntity(request);
        config = configRepository.save(config);
        return ConfigDtoMapper.INSTANCE.toResponse(config);
    }

}
