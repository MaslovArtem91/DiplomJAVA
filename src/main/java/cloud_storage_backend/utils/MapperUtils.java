package cloud_storage_backend.utils;

import cloud_storage_backend.dto.UserDto;
import cloud_storage_backend.entity.UserEntity;

public interface MapperUtils {

    UserEntity toUserEntity(UserDto userDto);

    UserDto toUserDto(UserEntity userEntity);

}
