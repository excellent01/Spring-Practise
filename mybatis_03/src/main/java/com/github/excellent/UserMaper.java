package com.github.excellent;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMaper {

    @Insert("insert into user (username) values (#{username})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    void add(User user);


    @Delete("delete from user where username = '${username}' ")
    void delete(User user);

    @Update("update user set username = #{username} where id = #{id}")
    void update(User user);

    @Select("select * from user")
    @Results(id="Basemap",value = {
            @Result(column = "u_id",property = "id"),
            @Result(column = "u_name",property = "name")
    })
    List<User> findAll();


}
