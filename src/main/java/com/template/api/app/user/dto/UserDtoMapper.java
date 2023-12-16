package com.template.api.app.user.dto;

import com.template.api.app.user.domain.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserDtoMapper {
    UserDtoMapper INSTANCE = Mappers.getMapper(UserDtoMapper.class);

    UserDto.Response toResponse(Account account);

}
