package com.template.api.app.user.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class UserDto {
  @NoArgsConstructor
  @Getter
  @Setter
  public static class Response {
    private String id;
    private String name;
    private String username;
  }

}
