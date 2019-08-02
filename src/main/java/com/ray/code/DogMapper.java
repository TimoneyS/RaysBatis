package com.ray.code;

import org.apache.ibatis.annotations.Select;

import com.ray.Dog;

public interface DogMapper {

    @Select("select * from dog where id = #{id}")
    public Dog selectDog(int i);

}
