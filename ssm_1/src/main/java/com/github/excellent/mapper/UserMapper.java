package com.github.excellent.mapper;
import com.github.excellent.po.User;
import java.util.List;

public interface UserMapper {
    List<User> findAll();
    List<User> BlurSearch(User user);
}
