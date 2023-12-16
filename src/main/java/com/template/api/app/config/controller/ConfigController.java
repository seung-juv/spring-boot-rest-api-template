package com.template.api.app.config.controller;

import com.template.api.app.config.dto.ConfigDto;
import com.template.api.app.config.service.ConfigService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/config")
@RestController
public class ConfigController {

  private final ConfigService configService;

  @GetMapping
  @Secured("ROLE_ADMIN")
  public ResponseEntity<ConfigDto.Response> get() {
    return ResponseEntity.ok(configService.get());
  }

  @PutMapping
  @Secured("ROLE_ADMIN")
  public ResponseEntity<ConfigDto.Response> update(
          @RequestBody ConfigDto.Update request
  ) {
    return ResponseEntity.ok(configService.update(request));
  }

}
